package it.unimib.disco.bigtwine.commons.models;

public interface TwitterStatus {
    String getId();
    void setId(String id);

    String getText();
    void setText(String text);

    TwitterUser getUser();
    void setUser(TwitterUser user);

    Coordinate getCoordinates();
    void setCoordinates(Coordinate coordinate);
}
