package it.unimib.disco.bigtwine.commons.executors;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.*;
import com.github.dockerjava.api.model.Bind;
import com.github.dockerjava.api.model.Frame;
import com.github.dockerjava.api.model.HostConfig;
import com.github.dockerjava.api.model.Volume;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.core.command.LogContainerResultCallback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DockerExecutor implements PerpetualExecutor, SyncExecutor {

    private DockerClient dockerClient = null;
    private String dockerImage;
    private String containerId;

    protected DockerExecutor(String dockerImage) {
        this.dockerImage = dockerImage;
    }

    protected abstract String[] buildContainerCommand(String... additionalArgs);
    protected abstract String[] prepareAdditionalContainerArgs(Object... additionalArgs);
    protected abstract void validateExecuteArgs(Object... args);

    protected DockerClient getDockerClient() {
        if (dockerClient == null) {
            DockerClientConfig config = DefaultDockerClientConfig
                    .createDefaultConfigBuilder()
                    .build();
            this.dockerClient = DockerClientBuilder
                    .getInstance(config)
                    .build();
        }

        return this.dockerClient;
    }

    protected CreateContainerCmd createContainer(String image, String... cmd) {
        return dockerClient
                .createContainerCmd(image)
                .withCmd(cmd);
    }

    protected abstract void configureContainer(CreateContainerCmd containerCmd, Object... args);

    protected CreateContainerResponse runContainer(CreateContainerCmd containerCmd) {
        CreateContainerResponse container = containerCmd.exec();
        this.getDockerClient()
                .startContainerCmd(container.getId())
                .exec();

        return container;
    }

    protected CreateContainerCmd setAutoRemove(CreateContainerCmd containerCmd, boolean autoRemove) {
        final HostConfig hostConfig = (containerCmd.getHostConfig() == null) ?
                HostConfig.newHostConfig() :
                containerCmd.getHostConfig();

        return containerCmd.withHostConfig(hostConfig.withAutoRemove(autoRemove));
    }

    protected CreateContainerCmd bindVolumes(CreateContainerCmd containerCmd, Bind... binds) {
        final HostConfig hostConfig = (containerCmd.getHostConfig() == null) ?
                HostConfig.newHostConfig() :
                containerCmd.getHostConfig();

        return containerCmd.withHostConfig(hostConfig.withBinds(binds));
    }

    protected String getContainerLogs(String containerId) {
        LogContainerCmd logContainerCmd = this.getDockerClient().logContainerCmd(containerId);
        logContainerCmd
                .withStdOut(true)
                .withStdErr(false);

        final StringBuilder logs = new StringBuilder();

        try {
            logContainerCmd.exec(new LogContainerResultCallback() {
                @Override
                public void onNext(Frame item) {
                    logs.append(item.toString());
                    logs.append('\n');
                }
            }).awaitCompletion();
        } catch (InterruptedException e) {
        }finally {
            this.getDockerClient().removeContainerCmd(containerId);
        }

        return logs.toString();
    }

    protected String getContainerLogs(CreateContainerResponse container) {
        return this.getContainerLogs(container.getId());
    }

    @Override
    public void run() {
        CreateContainerCmd containerCmd = this.createContainer(this.dockerImage);
        this.configureContainer(containerCmd);
        CreateContainerResponse container = this.runContainer(containerCmd);
        this.containerId = container.getId();
    }

    @Override
    public void stop() {
        if (this.containerId == null) {
            return;
        }

        this.getDockerClient().stopContainerCmd(this.containerId);
        this.getDockerClient().removeContainerCmd(this.containerId);
    }

    @Override
    public boolean isRunning() {
        if (this.containerId == null) {
            return false;
        }

        InspectContainerResponse containerInfo = this.getDockerClient()
                .inspectContainerCmd(this.containerId)
                .exec();

        if (containerInfo == null) {
            return false;
        }

        InspectContainerResponse.ContainerState state = containerInfo.getState();
        if (state == null) {
            return false;
        }

        if (state.getRunning() == null) {
            return false;
        }

        return state.getRunning();
    }

    @Override
    public String execute(Object... args) {
        this.validateExecuteArgs(args);
        String[] additionalArgs = this.prepareAdditionalContainerArgs(args);
        String[] cmd = this.buildContainerCommand(additionalArgs);
        CreateContainerCmd containerCmd = this.createContainer(this.dockerImage, cmd);
        this.configureContainer(containerCmd, args);
        CreateContainerResponse container = this.runContainer(containerCmd);

        return this.getContainerLogs(container);
    }
}
