package it.unimib.disco.bigtwine.commons.models.dto;

import java.io.Serializable;
import it.unimib.disco.bigtwine.commons.models.BasicTweet;

public class BasicTweetDTO implements BasicTweet, Serializable {
    private String id;
    private String text;

    public BasicTweetDTO() {
    }

    public BasicTweetDTO(String id, String text) {
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

}
