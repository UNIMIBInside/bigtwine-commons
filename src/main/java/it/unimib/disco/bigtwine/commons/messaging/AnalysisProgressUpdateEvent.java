package it.unimib.disco.bigtwine.commons.messaging;

import java.time.Instant;

public class AnalysisProgressUpdateEvent implements Event {
    private String analysisId;
    private String jobType;
    private Instant timestamp;
    private double progress;

    public AnalysisProgressUpdateEvent() {
    }

    public String getAnalysisId() {
        return analysisId;
    }

    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }
}
