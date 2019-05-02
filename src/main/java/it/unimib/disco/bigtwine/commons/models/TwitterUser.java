package it.unimib.disco.bigtwine.commons.models;

public interface TwitterUser {
    String getId();
    void setId(String id);
    
    String getName();
    void setName(String name);

    String getScreenName();
    void setScreenName(String screenName);

    String getLocation();
    void setLocation(String location);

    Coordinate getCoordinates();
    void setCoordinates(Coordinate coordinates);

    String getProfileImageUrl();
    void setProfileImageUrl(String profileImageUrl);
}
