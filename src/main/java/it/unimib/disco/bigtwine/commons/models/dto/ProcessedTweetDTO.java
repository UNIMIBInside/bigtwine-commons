package it.unimib.disco.bigtwine.commons.models.dto;

import it.unimib.disco.bigtwine.commons.messaging.dto.CoordinatesDTO;
import it.unimib.disco.bigtwine.commons.messaging.dto.LinkedEntityDTO;
import it.unimib.disco.bigtwine.commons.models.ProcessedTweet;

import java.io.Serializable;

public class ProcessedTweetDTO implements ProcessedTweet, Serializable {
    private String id;
    private String text;
    private TwitterUserDTO user;
    private CoordinatesDTO coordinate;
    private LinkedEntityDTO[] entities;

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

    public TwitterUserDTO getUser() {
        return user;
    }

    public void setUser(TwitterUserDTO user) {
        this.user = user;
    }

    public CoordinatesDTO getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(CoordinatesDTO coordinate) {
        this.coordinate = coordinate;
    }

    public LinkedEntityDTO[] getEntities() {
        return entities;
    }

    public void setEntities(LinkedEntityDTO[] entities) {
        this.entities = entities;
    }
}
