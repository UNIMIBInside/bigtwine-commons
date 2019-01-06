package it.unimib.disco.bigtwine.commons.executors;

public interface SyncExecutor extends Executor {
    String execute(Object... args);
}
