package it.unimib.disco.bigtwine.commons.models;

import it.unimib.disco.bigtwine.commons.models.dto.NamedEntityDTO;

public interface RecognizedTweet {
    String getId();
    void setId(String id);
    
    String getText();
    void setText(String text);
    
    NamedEntityDTO[] getEntities();
    void setEntities(NamedEntityDTO[] entities);
    NamedEntityDTO getEntity(int index);
}
