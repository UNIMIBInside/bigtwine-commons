package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.RecognizedTweet;

public class NerResponseMessage {
    private String requestId;
    private String recognizer = "default";
    private RecognizedTweet[] tweets;

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

    public RecognizedTweet[] getTweets() {
        return tweets;
    }

    public void setTweets(RecognizedTweet[] tweets) {
        this.tweets = tweets;
    }
}