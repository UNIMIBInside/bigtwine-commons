package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.LinkedEntity;
import it.unimib.disco.bigtwine.commons.models.TwitterStatus;

import java.time.Instant;

public class NeelTweetProcessedEvent implements Event {
    private String analysisId;
    private Instant processDate;
    private TwitterStatus status;
    private LinkedEntity[] entities;

    public NeelTweetProcessedEvent() {
    }

    public NeelTweetProcessedEvent(String analysisId, Instant processDate, TwitterStatus status, LinkedEntity[] entities) {
        this.analysisId = analysisId;
        this.processDate = processDate;
        this.status = status;
        this.entities = entities;
    }

    public String getAnalysisId() {
        return analysisId;
    }

    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
    }

    public TwitterStatus getStatus() {
        return status;
    }

    public void setStatus(TwitterStatus status) {
        this.status = status;
    }

    public LinkedEntity[] getEntities() {
        return entities;
    }

    public void setEntities(LinkedEntity[] entities) {
        this.entities = entities;
    }

    public Instant getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Instant processDate) {
        this.processDate = processDate;
    }
}
