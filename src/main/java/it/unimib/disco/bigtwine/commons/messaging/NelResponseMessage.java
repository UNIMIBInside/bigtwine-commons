package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.dto.LinkedTweetDTO;

public class NelResponseMessage implements ResponseMessage {
    private String requestId;
    private String linker = "default";
    private LinkedTweetDTO[] tweets;

    public NelResponseMessage() {
    }

    public NelResponseMessage(String requestId, String linker, LinkedTweetDTO[] tweets) {
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

    public String getLinker() {
        return linker;
    }

    public void setLinker(String linker) {
        this.linker = linker;
    }

    public LinkedTweetDTO[] getTweets() {
        return tweets;
    }

    public void setTweets(LinkedTweetDTO[] tweets) {
        this.tweets = tweets;
    }
}
