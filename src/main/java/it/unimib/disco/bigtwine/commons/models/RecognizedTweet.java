package it.unimib.disco.bigtwine.commons.models;

public interface RecognizedTweet {
    String getId();
    void setId(String id);
    
    String getText();
    void setText(String text);
    
    NamedEntity[] getEntities();
    void setEntities(NamedEntity[] entities);
    NamedEntity getEntity(int index);
}
