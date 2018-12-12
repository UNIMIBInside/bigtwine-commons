package it.unimib.disco.bigtwine.commons.models;

public class RecognizedTweet {
    private String id;
    private String text;
    private Entity[] entities;

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

    public Entity[] getEntities() {
        return entities;
    }

    public void setEntities(Entity[] entities) {
        this.entities = entities;
    }

    public Entity getEntity(int index) {
        return entities[index];
    }
}
