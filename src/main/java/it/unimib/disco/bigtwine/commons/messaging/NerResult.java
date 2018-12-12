package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.RecognizedTweet;

public class NerResult {
    private String requestId;
    private RecognizedTweet[] recognizedTweets;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public RecognizedTweet[] getRecognizedTweets() {
        return recognizedTweets;
    }

    public void setRecognizedTweets(RecognizedTweet[] recognizedTweets) {
        this.recognizedTweets = recognizedTweets;
    }
}
