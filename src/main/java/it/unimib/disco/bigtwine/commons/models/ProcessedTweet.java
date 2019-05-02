package it.unimib.disco.bigtwine.commons.models;

public interface ProcessedTweet {
    String getId();
    void setId(String id);
    
    String getText();
    void setText(String text);
    
    TwitterUser getUser();
    void setUser(TwitterUser user);
    
    Coordinate getCoordinate();
    void setCoordinate(Coordinate coordinate);
    
    LinkedEntity[] getEntities();
    void setEntities(LinkedEntity[] entities);
}
