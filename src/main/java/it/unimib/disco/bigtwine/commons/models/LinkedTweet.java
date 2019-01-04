package it.unimib.disco.bigtwine.commons.models;

import javax.validation.constraints.NotNull;

public class LinkedTweet {
    private String id;
    private String text;
    private Entity[] entities;

    public static class Entity {
        private EntityTextRange position;
        private String resource;
        private float confidence;
        private String category;
        private boolean isNil;
        private String nilCluster;

        public Entity() {

        }

        public Entity(@NotNull EntityTextRange position, @NotNull String resourceOrNilCluster, float confidence, @NotNull String category, boolean isNil) {
            if (confidence < 0 || confidence > 1.0) {
                throw new IllegalArgumentException("Confidence must be between 0 and 1 (included)");
            }

            this.position = position;
            this.confidence = confidence;
            this.category = category;
            this.isNil = isNil;

            if (isNil) {
                this.nilCluster = resourceOrNilCluster;
            }else {
                this.resource = resourceOrNilCluster;
            }
        }

        public EntityTextRange getPosition() {
            return position;
        }

        public void setPosition(@NotNull EntityTextRange position) {
            this.position = position;
        }

        public String getResource() {
            return resource;
        }

        public void setResource(String resource) {
            if (resource != null && this.nilCluster != null) {
                throw new IllegalStateException("This entity has already set a resource (an entity cannot have both a resource and a nil cluster).");
            }
            this.resource = resource;
        }

        public float getConfidence() {
            return confidence;
        }

        public void setConfidence(float confidence) {
            this.confidence = confidence;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(@NotNull String category) {
            this.category = category;
        }

        public boolean isNil() {
            return isNil;
        }

        public String getNilCluster() {
            return nilCluster;
        }

        public void setNilCluster(String nilCluster) {
            if (nilCluster != null && this.resource != null) {
                throw new IllegalStateException("This entity has already set a resource (an entity cannot have both a resource and a nil cluster).");
            }
            this.nilCluster = nilCluster;
            this.isNil = nilCluster != null;
        }
    }

    public static class EntityTextRange {
        private int start;
        private int end;

        public EntityTextRange(int start, int end) {
            if (start < 0 || end < 0 || end <= start) {
                throw new IllegalArgumentException("both end and start must be > 0 and end must be > start");
            }
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            if (start < 0 || end <= start) {
                throw new IllegalArgumentException("both end and start must be > 0 and end must be > start");
            }
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            if (end < 0 || end <= start) {
                throw new IllegalArgumentException("both end and start must be > 0 and end must be > start");
            }
            this.end = end;
        }
    }

    public LinkedTweet() {

    }

    public LinkedTweet(String id, String text, Entity[] entities) {
        this.id = id;
        this.text = text;
        this.entities = entities;
    }

    public LinkedTweet(String id, String text) {
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
