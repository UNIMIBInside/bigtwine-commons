package it.unimib.disco.bigtwine.commons.models.dto;

import it.unimib.disco.bigtwine.commons.models.LinkedEntity;
import it.unimib.disco.bigtwine.commons.models.TwitterStatus;

import java.io.Serializable;

public class NeelProcessedTweetDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private TwitterStatusDTO status;
    private LinkedEntityDTO[] entities;

    public TwitterStatus getStatus() {
        return status;
    }

    public void setStatus(TwitterStatusDTO status) {
        this.status = status;
    }

    public LinkedEntityDTO[] getEntities() {
        return entities;
    }

    public void setEntities(LinkedEntityDTO[] entities) {
        this.entities = entities;
    }
}
