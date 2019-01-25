package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.BasicTweet;

public class NerRequestMessage {
    private String requestId;
    private String recognizer = "default";
    private BasicTweet[] tweets;

    public NerRequestMessage() {
    }

    public NerRequestMessage(String requestId, String recognizer, BasicTweet[] tweets) {
        this.requestId = requestId;
        this.recognizer = recognizer;
        this.tweets = tweets;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRecognizer() {
        return recognizer;
    }

    public void setRecognizer(String recognizer) {
        this.recognizer = recognizer;
    }

    public BasicTweet[] getTweets() {
        return tweets;
    }

    public void setTweets(BasicTweet[] tweets) {
        this.tweets = tweets;
    }
}
