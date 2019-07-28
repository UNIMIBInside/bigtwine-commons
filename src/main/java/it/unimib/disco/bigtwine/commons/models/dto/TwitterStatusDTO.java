package it.unimib.disco.bigtwine.commons.models.dto;

import it.unimib.disco.bigtwine.commons.models.Coordinate;
import it.unimib.disco.bigtwine.commons.models.TwitterStatus;
import it.unimib.disco.bigtwine.commons.models.TwitterUser;

public class TwitterStatusDTO implements TwitterStatus {
    private String id;
    private String text;
    private TwitterUserDTO user;
    private CoordinatesDTO coordinates;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public TwitterUserDTO getUser() {
        return user;
    }

    @Override
    public void setUser(TwitterUserDTO user) {
        this.user = user;
    }

    public CoordinatesDTO getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(CoordinatesDTO coordinates) {
        this.coordinates = coordinates;
    }
}
