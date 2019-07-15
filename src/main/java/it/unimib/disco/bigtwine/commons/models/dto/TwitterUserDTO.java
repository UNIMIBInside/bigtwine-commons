package it.unimib.disco.bigtwine.commons.models.dto;

import it.unimib.disco.bigtwine.commons.models.TwitterUser;
import it.unimib.disco.bigtwine.commons.models.Coordinate;
import java.io.Serializable;

public class TwitterUserDTO implements TwitterUser, Serializable {
    private String id;
    private String name;
    private String screenName;
    private String location;
    private Coordinate coordinates;
    private String profileImageUrl;

    public TwitterUserDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Coordinate getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinate coordinates) {
        this.coordinates = coordinates;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }
}