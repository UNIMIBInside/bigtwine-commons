package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.AnalysisStatusEnum;

public class AnalysisStatusChangeRequestedEvent implements Event {
    private String analysisId;
    private AnalysisStatusEnum desiredStatus;
    private String user;

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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
