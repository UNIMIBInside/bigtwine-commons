package it.unimib.disco.bigtwine.commons.models;

import javax.validation.constraints.NotNull;

public class NamedEntity {
    private String value;
    private String label;
    private float probability;

    public NamedEntity() {

    }

    public NamedEntity(@NotNull String value, @NotNull String label, float probability) {
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
