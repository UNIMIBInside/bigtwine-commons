package it.unimib.disco.bigtwine.commons.models;

import javax.validation.constraints.NotNull;

public interface LinkedEntity {
    TextRange getPosition();
    void setPosition(@NotNull TextRange position);
    
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
    
    Resource getResource();
    void setResource(Resource resource);
}
