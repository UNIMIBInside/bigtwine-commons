package it.unimib.disco.bigtwine.commons.messaging;

import java.time.Instant;

public class JobHeartbeatEvent implements Event {
    private String jobId;
    private Instant timestamp;
    private boolean isLast = false;
    private double progress = -1;

    public JobHeartbeatEvent() {
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isLast() {
        return isLast;
    }

    public void setLast(boolean last) {
        isLast = last;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }
}
