package it.unimib.disco.bigtwine.commons.processors;

import it.unimib.disco.bigtwine.commons.executors.AsyncExecutor;

public interface AsyncProcessor {
    AsyncExecutor getAsyncExecutor();
}
