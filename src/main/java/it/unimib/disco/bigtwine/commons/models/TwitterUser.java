package it.unimib.disco.bigtwine.commons.models;

import it.unimib.disco.bigtwine.commons.models.dto.CoordinatesDTO;

public interface TwitterUser {
    String getId();
    void setId(String id);
    
    String getName();
    void setName(String name);

    String getScreenName();
    void setScreenName(String screenName);

    String getLocation();
    void setLocation(String location);

    CoordinatesDTO getCoordinates();
    void setCoordinates(CoordinatesDTO coordinates);

    String getProfileImageUrl();
    void setProfileImageUrl(String profileImageUrl);
}
