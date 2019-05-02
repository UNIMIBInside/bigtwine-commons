package it.unimib.disco.bigtwine.commons.models;

public interface LinkedTweet {
    String getId();
    void setId(String id);
    
    String getText();
    void setText(String text);
    
    LinkedEntity[] getEntities();
    void setEntities(LinkedEntity[] entities);
    LinkedEntity getEntity(int index);
}
