package it.unimib.disco.bigtwine.commons.models;

import java.io.Serializable;

public class ProcessedTweet implements Serializable {
    private String id;
    private String text;
    private TwitterUser user;
    private Coordinate coordinate;
    private LinkedEntity[] entities;

    public ProcessedTweet() {
    }

    public ProcessedTweet(String id) {
        this.id = id;
    }

    public ProcessedTweet(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TwitterUser getUser() {
        return user;
    }

    public void setUser(TwitterUser user) {
        this.user = user;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public LinkedEntity[] getEntities() {
        return entities;
    }

    public void setEntities(LinkedEntity[] entities) {
        this.entities = entities;
    }
}
