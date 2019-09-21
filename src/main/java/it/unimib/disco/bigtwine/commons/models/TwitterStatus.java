package it.unimib.disco.bigtwine.commons.models;

import it.unimib.disco.bigtwine.commons.messaging.dto.CoordinatesDTO;
import it.unimib.disco.bigtwine.commons.models.dto.TwitterUserDTO;

public interface TwitterStatus {
    String getId();
    void setId(String id);

    String getText();
    void setText(String text);

    TwitterUserDTO getUser();
    void setUser(TwitterUserDTO user);

    CoordinatesDTO getCoordinates();
    void setCoordinates(CoordinatesDTO coordinate);
}
