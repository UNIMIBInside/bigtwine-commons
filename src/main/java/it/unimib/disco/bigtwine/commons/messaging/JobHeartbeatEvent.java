package it.unimib.disco.bigtwine.commons.messaging;

import java.time.Instant;

public class JobHeartbeatEvent implements Event {
    private String jobId;
    private Instant timestamp;

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
}
