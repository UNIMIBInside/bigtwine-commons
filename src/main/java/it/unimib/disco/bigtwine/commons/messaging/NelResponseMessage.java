package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.LinkedTweet;

public class NelResponseMessage {
    private String requestId;
    private String linker = "default";
    private LinkedTweet[] tweets;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getLinker() {
        return linker;
    }

    public void setLinker(String linker) {
        this.linker = linker;
    }

    public LinkedTweet[] getTweets() {
        return tweets;
    }

    public void setTweets(LinkedTweet[] tweets) {
        this.tweets = tweets;
    }
}
