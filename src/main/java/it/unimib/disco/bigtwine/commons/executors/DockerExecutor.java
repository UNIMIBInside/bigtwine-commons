package it.unimib.disco.bigtwine.commons.executors;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.*;
import com.github.dockerjava.api.model.Frame;
import com.github.dockerjava.api.model.HostConfig;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.core.command.LogContainerResultCallback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DockerExecutor implements AsyncExecutor, SyncExecutor {

    private DockerClient dockerClient = null;
    private String dockerImage;
    private String containerId;

    protected DockerExecutor(String dockerImage) {
        this.dockerImage = dockerImage;
    }

    protected abstract List<String> getArguments();

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

    protected CreateContainerCmd createContainer(String image, List<String> args) {
        return dockerClient
                .createContainerCmd(image)
                .withCmd(args);
    }

    protected CreateContainerResponse runContainer(String image, String... args) {
        return this.runContainer(image, Arrays.asList(args));
    }

    protected CreateContainerResponse runContainer(String image, List<String> args) {
        DockerClient dockerClient = this.getDockerClient();

        CreateContainerResponse container = this.createContainer(image, args).exec();
        dockerClient.startContainerCmd(container.getId()).exec();

        return container;
    }

    @Override
    public void run() {
        CreateContainerResponse container = this.runContainer(this.dockerImage, this.getArguments());
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
    public String execute() {
        DockerClient dockerClient = this.getDockerClient();
        CreateContainerResponse container = this.runContainer(this.dockerImage, this.getArguments());
        String containerId = container.getId();

        LogContainerCmd logContainerCmd = dockerClient.logContainerCmd(containerId);
        logContainerCmd
                .withStdOut(true)
                .withStdErr(false);
        final List<String> logs = new ArrayList<>();
        try {
            logContainerCmd.exec(new LogContainerResultCallback() {
                @Override
                public void onNext(Frame item) {
                    logs.add(item.toString());
                }
            }).awaitCompletion();
        } catch (InterruptedException e) {
        }finally {
            this.getDockerClient().removeContainerCmd(containerId);
        }

        return String.join("\n", logs);
    }
}
