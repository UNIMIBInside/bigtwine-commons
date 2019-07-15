package it.unimib.disco.bigtwine.commons.models.dto;

import it.unimib.disco.bigtwine.commons.models.LinkedEntity;
import it.unimib.disco.bigtwine.commons.models.TwitterStatus;

import java.io.Serializable;

public class NeelProcessedTweetDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private TwitterStatus status;
    private LinkedEntity[] entities;

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
}
