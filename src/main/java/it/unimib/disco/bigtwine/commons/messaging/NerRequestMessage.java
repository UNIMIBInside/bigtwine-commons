package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.BasicTweet;

public class NerRequestMessage implements RequestMessage {
    private String requestId;
    private String recognizer = "default";
    private BasicTweet[] tweets;
    private String outputTopic;

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

    @Override
    public String getOutputTopic() {
        return outputTopic;
    }

    @Override
    public void setOutputTopic(String outputTopic) {
        this.outputTopic = outputTopic;
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
