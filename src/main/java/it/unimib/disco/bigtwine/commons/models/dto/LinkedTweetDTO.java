package it.unimib.disco.bigtwine.commons.models.dto;

import it.unimib.disco.bigtwine.commons.models.LinkedTweet;
import it.unimib.disco.bigtwine.commons.models.LinkedEntity;
import java.io.Serializable;

public class LinkedTweetDTO implements LinkedTweet, Serializable {
    private String id;
    private String text;
    private LinkedEntity[] entities;

    public LinkedTweetDTO() {

    }

    public LinkedTweetDTO(String id, String text, LinkedEntity[] entities) {
        this.id = id;
        this.text = text;
        this.entities = entities;
    }

    public LinkedTweetDTO(String id, String text) {
        this(id, text, new LinkedEntity[0]);
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

    public LinkedEntity[] getEntities() {
        return entities;
    }

    public void setEntities(LinkedEntity[] entities) {
        this.entities = entities;
    }

    public LinkedEntity getEntity(int index) {
        return entities[index];
    }
}
