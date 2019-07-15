package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.AnalysisResultPayload;
import java.time.Instant;

public class AnalysisResultProducedEvent implements Event {
    private static final long serialVersionUID = 1L;

    private String analysisId;
    private Instant processDate;
    private AnalysisResultPayload payload;

    public String getAnalysisId() {
        return analysisId;
    }

    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
    }

    public Instant getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Instant processDate) {
        this.processDate = processDate;
    }

    public AnalysisResultPayload getPayload() {
        return payload;
    }

    public void setPayload(AnalysisResultPayload payload) {
        this.payload = payload;
    }
}
