package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.dto.RecognizedTweetDTO;

public class NerResponseMessage implements ResponseMessage {
    private String requestId;
    private String recognizer = "default";
    private RecognizedTweetDTO[] tweets;

    public NerResponseMessage() {
    }

    public NerResponseMessage(String requestId, String recognizer, RecognizedTweetDTO[] tweets) {
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

    public RecognizedTweetDTO[] getTweets() {
        return tweets;
    }

    public void setTweets(RecognizedTweetDTO[] tweets) {
        this.tweets = tweets;
    }
}
