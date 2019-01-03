package it.unimib.disco.bigtwine.commons.processors.file;

import it.unimib.disco.bigtwine.commons.executors.FileExecutor;
import org.apache.commons.io.monitor.FileAlterationMonitor;

import java.io.File;

public interface FileProcessor {
    FileExecutor getFileExecutor();
    String getOutputDirectory();
    void setOutputDirectory(String outputDirectory);
    String getInputDirectory();
    void setInputDirectory(String inputDirectory);
    String getWorkingDirectory();
    void setWorkingDirectory(String workingDirectory);
    boolean setupWorkingDirectory();

    void processOutputFile(File file);
}
