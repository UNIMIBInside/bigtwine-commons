package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.dto.BasicTweetDTO;

public class NerRequestMessage implements RequestMessage {
    private String requestId;
    private String recognizer = "default";
    private BasicTweetDTO[] tweets;
    private String outputTopic;

    public NerRequestMessage() {
    }

    public NerRequestMessage(String requestId, String recognizer, BasicTweetDTO[] tweets) {
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

    public BasicTweetDTO[] getTweets() {
        return tweets;
    }

    public void setTweets(BasicTweetDTO[] tweets) {
        this.tweets = tweets;
    }
}
