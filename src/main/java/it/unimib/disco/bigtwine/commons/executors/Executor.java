package it.unimib.disco.bigtwine.commons.executors;

import java.util.Map;

public interface Executor {
    String getExecutorId();
    Map<String, Object> getExecutorConf();
    void setExecutorConf(Map<String, Object> conf);
}
