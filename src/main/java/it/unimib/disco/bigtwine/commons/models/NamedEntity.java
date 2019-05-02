package it.unimib.disco.bigtwine.commons.models;

import javax.validation.constraints.NotNull;

public interface NamedEntity {
    String getValue();
    void setValue(@NotNull String value);
    
    String getLabel();
    void setLabel(@NotNull String label);
    
    float getProbability();
    void setProbability(float probability);
}
