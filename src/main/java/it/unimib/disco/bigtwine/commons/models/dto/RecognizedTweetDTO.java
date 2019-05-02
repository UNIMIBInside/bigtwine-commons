package it.unimib.disco.bigtwine.commons.models.dto;

import it.unimib.disco.bigtwine.commons.models.RecognizedTweet;
import it.unimib.disco.bigtwine.commons.models.NamedEntity;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class RecognizedTweetDTO implements RecognizedTweet, Serializable {
    private String id;
    private String text;
    private NamedEntity[] entities;

    public RecognizedTweetDTO() {
    }

    public RecognizedTweetDTO(@NotNull String id, String text, NamedEntity[] entities) {
        this.id = id;
        this.text = text;
        this.entities = entities;
    }

    public RecognizedTweetDTO(@NotNull String id, String text) {
        this(id, text, new NamedEntity[0]);
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

    public NamedEntity[] getEntities() {
        return entities;
    }

    public void setEntities(NamedEntity[] entities) {
        this.entities = entities;
    }

    public NamedEntity getEntity(int index) {
        return entities[index];
    }
}
