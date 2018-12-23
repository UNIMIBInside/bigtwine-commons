package it.unimib.disco.bigtwine.commons.processors.file;

import it.unimib.disco.bigtwine.commons.executors.AsyncExecutor;
import it.unimib.disco.bigtwine.commons.executors.AsyncFileExecutor;
import it.unimib.disco.bigtwine.commons.processors.AsyncProcessor;
import org.apache.commons.io.filefilter.AndFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.HiddenFileFilter;
import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;

public interface AsyncFileProcessor extends FileProcessor, AsyncProcessor {

    AsyncFileExecutor getAsyncFileExecutor();
    FileAlterationMonitor getFileMonitor();
    void setFileMonitor(FileAlterationMonitor fileMonitor);
    boolean getMonitorFilesOnly();
    String getMonitorSuffixFilter();
    void setMonitorFilesOnly(boolean flag);
    void setMonitorSuffixFilter(String suffixFilter);

    default boolean configureFileMonitor() {
        final long POLL_INTERVAL = 100;

        AndFileFilter filters = (AndFileFilter)FileFilterUtils.and(HiddenFileFilter.VISIBLE);
        if (this.getMonitorFilesOnly()) {
            filters.addFileFilter(FileFilterUtils.fileFileFilter());
        }
        if (this.getMonitorSuffixFilter() != null) {
            filters.addFileFilter(FileFilterUtils.suffixFileFilter(this.getMonitorSuffixFilter()));
        }
        FileFilterUtils.and(filters);

        FileAlterationObserver observer = new FileAlterationObserver(this.getOutputDirectory(), filters);
        FileAlterationMonitor monitor = new FileAlterationMonitor(POLL_INTERVAL);
        FileAlterationListener listener = new FileAlterationListenerAdaptor() {
            @Override
            public void onFileCreate(File file) {
                processOutputFile(file);
            }
        };

        observer.addListener(listener);
        monitor.addObserver(observer);
        this.setFileMonitor(monitor);

        return true;
    }

    default boolean startFileMonitor() {
        if (this.getFileMonitor() == null) {
            this.configureFileMonitor();
        }

        try {
            this.getFileMonitor().start();
        }catch(Exception e) {
            return false;
        }

        return true;
    }

    default boolean stopFileMonitor() {
        if (this.getFileMonitor() == null) {
            return false;
        }

        try {
            this.getFileMonitor().stop();
        }catch(Exception e) {
            return false;
        }

        return true;
    }
}
