package it.unimib.disco.bigtwine.commons.models.dto;

import it.unimib.disco.bigtwine.commons.models.Coordinate;
import it.unimib.disco.bigtwine.commons.models.TwitterStatus;
import it.unimib.disco.bigtwine.commons.models.TwitterUser;

public class TwitterStatusDTO implements TwitterStatus {
    private String id;
    private String text;
    private TwitterUser user;
    private Coordinate coordinates;

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
    public TwitterUser getUser() {
        return user;
    }

    @Override
    public void setUser(TwitterUser user) {
        this.user = user;
    }

    public Coordinate getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinate coordinates) {
        this.coordinates = coordinates;
    }
}
