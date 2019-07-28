package it.unimib.disco.bigtwine.commons.models;

import it.unimib.disco.bigtwine.commons.models.dto.ResourceDTO;
import it.unimib.disco.bigtwine.commons.models.dto.TextRangeDTO;

import javax.validation.constraints.NotNull;

public interface LinkedEntity {

    TextRangeDTO getPosition();
    void setPosition(@NotNull TextRangeDTO position);

    String getValue();
    void setValue(String value);
    
    String getLink();
    void setLink(String link);
    
    float getConfidence();
    void setConfidence(float confidence);
    
    String getCategory();
    void setCategory(@NotNull String category);
    
    boolean isNil();
    default boolean getIsNil() {
        return isNil();
    }

    String getNilCluster();
    void setNilCluster(String nilCluster);
    
    ResourceDTO getResource();
    void setResource(ResourceDTO resource);
}
