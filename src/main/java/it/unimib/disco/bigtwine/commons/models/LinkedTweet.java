package it.unimib.disco.bigtwine.commons.models;

import it.unimib.disco.bigtwine.commons.models.dto.LinkedEntityDTO;

public interface LinkedTweet {
    String getId();
    void setId(String id);
    
    String getText();
    void setText(String text);
    
    LinkedEntityDTO[] getEntities();
    void setEntities(LinkedEntityDTO[] entities);
    LinkedEntityDTO getEntity(int index);
}
