package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.AnalysisStatusEnum;

public class AnalysisStatusChangeRequestedEvent implements Event {
    private String analysisId;
    private AnalysisStatusEnum desiredStatus;
    private boolean userRequested;

    public AnalysisStatusChangeRequestedEvent() {
    }

    public String getAnalysisId() {
        return analysisId;
    }

    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
    }

    public AnalysisStatusEnum getDesiredStatus() {
        return desiredStatus;
    }

    public void setDesiredStatus(AnalysisStatusEnum desiredStatus) {
        this.desiredStatus = desiredStatus;
    }

    public boolean isUserRequested() {
        return userRequested;
    }

    public void setUserRequested(boolean userRequested) {
        this.userRequested = userRequested;
    }
}
