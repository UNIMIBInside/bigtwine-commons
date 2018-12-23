package it.unimib.disco.bigtwine.commons.executors;

public interface FileExecutor extends Executor {
    void setInputPath(String inputFile);
    String getInputPath();
    void setOutputPath(String outputFile);
    String getOutputPath();
}
