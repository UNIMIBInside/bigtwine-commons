package it.unimib.disco.bigtwine.commons.models.dto;

import it.unimib.disco.bigtwine.commons.models.LinkedTweet;
import it.unimib.disco.bigtwine.commons.models.LinkedEntity;
import java.io.Serializable;

public class LinkedTweetDTO implements LinkedTweet, Serializable {
    private String id;
    private String text;
    private LinkedEntityDTO[] entities;

    public LinkedTweetDTO() {

    }

    public LinkedTweetDTO(String id, String text, LinkedEntityDTO[] entities) {
        this.id = id;
        this.text = text;
        this.entities = entities;
    }

    public LinkedTweetDTO(String id, String text) {
        this(id, text, new LinkedEntityDTO[0]);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LinkedEntityDTO[] getEntities() {
        return entities;
    }

    public void setEntities(LinkedEntityDTO[] entities) {
        this.entities = entities;
    }

    public LinkedEntityDTO getEntity(int index) {
        return entities[index];
    }
}
