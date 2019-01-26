package it.unimib.disco.bigtwine.commons.models;

import java.io.Serializable;

public class BasicTweet implements Serializable {
    private String id;
    private String text;

    public BasicTweet() {
    }

    public BasicTweet(String id, String text) {
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
