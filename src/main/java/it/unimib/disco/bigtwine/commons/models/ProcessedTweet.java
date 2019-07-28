package it.unimib.disco.bigtwine.commons.models;

import it.unimib.disco.bigtwine.commons.models.dto.CoordinatesDTO;
import it.unimib.disco.bigtwine.commons.models.dto.LinkedEntityDTO;
import it.unimib.disco.bigtwine.commons.models.dto.TwitterUserDTO;

public interface ProcessedTweet {
    String getId();
    void setId(String id);
    
    String getText();
    void setText(String text);
    
    TwitterUserDTO getUser();
    void setUser(TwitterUserDTO user);
    
    CoordinatesDTO getCoordinate();
    void setCoordinate(CoordinatesDTO coordinate);
    
    LinkedEntityDTO[] getEntities();
    void setEntities(LinkedEntityDTO[] entities);
}
