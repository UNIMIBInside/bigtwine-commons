package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.dto.RecognizedTweetDTO;

public class NelRequestMessage implements RequestMessage {
    private String requestId;
    private String outputTopic;
    private String linker = "default";
    private RecognizedTweetDTO[] tweets;

    public NelRequestMessage() {
    }

    public NelRequestMessage(String requestId, String linker, RecognizedTweetDTO[] tweets) {
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

    public RecognizedTweetDTO[] getTweets() {
        return tweets;
    }

    public void setTweets(RecognizedTweetDTO[] tweets) {
        this.tweets = tweets;
    }
}
