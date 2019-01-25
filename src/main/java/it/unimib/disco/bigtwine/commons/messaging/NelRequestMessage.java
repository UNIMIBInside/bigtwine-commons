package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.RecognizedTweet;

public class NelRequestMessage implements RequestMessage {
    private String requestId;
    private String outputTopic;
    private String linker = "default";
    private RecognizedTweet[] tweets;

    public NelRequestMessage() {
    }

    public NelRequestMessage(String requestId, String linker, RecognizedTweet[] tweets) {
        this.requestId = requestId;
        this.linker = linker;
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

    public String getLinker() {
        return linker;
    }

    public void setLinker(String linker) {
        this.linker = linker;
    }

    public RecognizedTweet[] getTweets() {
        return tweets;
    }

    public void setTweets(RecognizedTweet[] tweets) {
        this.tweets = tweets;
    }
}
