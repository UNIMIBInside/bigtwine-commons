package it.unimib.disco.bigtwine.commons.processors.file;

import it.unimib.disco.bigtwine.commons.executors.SyncFileExecutor;
import it.unimib.disco.bigtwine.commons.processors.SyncProcessor;

import java.io.File;

public interface SyncFileProcessor extends SyncProcessor, FileProcessor {
    SyncFileExecutor getSyncFileExecutor();
}
