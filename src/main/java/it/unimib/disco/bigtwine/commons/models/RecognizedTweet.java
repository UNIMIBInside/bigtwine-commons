package it.unimib.disco.bigtwine.commons.models;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class RecognizedTweet implements Serializable {
    private String id;
    private String text;
    private NamedEntity[] entities;

    public RecognizedTweet() {
    }

    public RecognizedTweet(@NotNull String id, String text, NamedEntity[] entities) {
        this.id = id;
        this.text = text;
        this.entities = entities;
    }

    public RecognizedTweet(@NotNull String id, String text) {
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
