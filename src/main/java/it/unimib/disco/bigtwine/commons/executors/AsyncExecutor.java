package it.unimib.disco.bigtwine.commons.executors;

public interface AsyncExecutor extends Executor {
    void run();
    void stop();
    boolean isRunning();
}
