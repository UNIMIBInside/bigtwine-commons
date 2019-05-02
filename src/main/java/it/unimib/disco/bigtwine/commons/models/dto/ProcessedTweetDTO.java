package it.unimib.disco.bigtwine.commons.models.dto;

import it.unimib.disco.bigtwine.commons.models.ProcessedTweet;
import it.unimib.disco.bigtwine.commons.models.LinkedEntity;
import it.unimib.disco.bigtwine.commons.models.TwitterUser;
import it.unimib.disco.bigtwine.commons.models.Coordinate;
import java.io.Serializable;

public class ProcessedTweetDTO implements ProcessedTweet, Serializable {
    private String id;
    private String text;
    private TwitterUser user;
    private Coordinate coordinate;
    private LinkedEntity[] entities;

    public ProcessedTweetDTO() {
    }

    public ProcessedTweetDTO(String id) {
        this.id = id;
    }

    public ProcessedTweetDTO(String id, String text) {
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
