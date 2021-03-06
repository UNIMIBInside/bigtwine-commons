package it.unimib.disco.bigtwine.commons.messaging.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class LinkedEntityDTO implements Serializable {
    private String value;
    private TextRangeDTO position;
    private String link;
    private float confidence;
    private String category;
    private boolean isNil;
    private String nilCluster;
    private ResourceDTO resource;

    public LinkedEntityDTO() {

    }

    public LinkedEntityDTO(@NotNull TextRangeDTO position, @NotNull String linkOrNilCluster, float confidence, @NotNull String category, boolean isNil) {
        if (confidence < 0 || confidence > 1.0) {
            throw new IllegalArgumentException("Confidence must be between 0 and 1 (included)");
        }

        this.position = position;
        this.confidence = confidence;
        this.category = category;
        this.isNil = isNil;

        if (isNil) {
            this.nilCluster = linkOrNilCluster;
        }else {
            this.link = linkOrNilCluster;
        }
    }

    public LinkedEntityDTO(@NotNull String value, @NotNull TextRangeDTO position, @NotNull String linkOrNilCluster, float confidence, @NotNull String category, boolean isNil) {
        this(position, linkOrNilCluster, confidence, category, isNil);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TextRangeDTO getPosition() {
        return position;
    }

    public void setPosition(@NotNull TextRangeDTO position) {
        this.position = position;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        if (link != null && this.nilCluster != null) {
            throw new IllegalStateException("This entity has already set a link (an entity cannot have both a link and a nil cluster).");
        }
        this.link = link;
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
        if (nilCluster != null && this.link != null) {
            throw new IllegalStateException("This entity has already set a link (an entity cannot have both a link and a nil cluster).");
        }
        this.nilCluster = nilCluster;
        this.isNil = nilCluster != null;
    }

    public ResourceDTO getResource() {
        return resource;
    }

    public void setResource(ResourceDTO resource) {
        this.resource = resource;
    }
}
