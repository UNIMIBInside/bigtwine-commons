package it.unimib.disco.bigtwine.commons.models;

import javax.validation.constraints.NotNull;

public class RecognizedTweet {
    private String id;
    private String text;
    private Entity[] entities;

    public static class Entity {
        private String value;
        private String label;
        private float probability;

        public Entity() {

        }

        public Entity(@NotNull String value, @NotNull String label, float probability) {
            this.value = value;
            this.label = label;
            this.probability = probability;
        }

        public String getValue() {
            return value;
        }

        public void setValue(@NotNull String value) {
            this.value = value;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(@NotNull String label) {
            this.label = label;
        }

        public float getProbability() {
            return probability;
        }

        public void setProbability(float probability) {
            this.probability = probability;
        }
    }

    public RecognizedTweet() {
    }

    public RecognizedTweet(@NotNull String id, String text, Entity[] entities) {
        this.id = id;
        this.text = text;
        this.entities = entities;
    }

    public RecognizedTweet(@NotNull String id, String text) {
        this(id, text, new Entity[0]);
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
