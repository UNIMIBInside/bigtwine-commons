package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.ProcessedTweet;

public class TweetProcessedEvent implements Event {
    private String analysisId;
    private ProcessedTweet tweet;

    public TweetProcessedEvent() {
    }

    public TweetProcessedEvent(String sessionId, ProcessedTweet tweet) {
        this.analysisId = sessionId;
        this.tweet = tweet;
    }

    public String getAnalysisId() {
        return analysisId;
    }

    public void setAnalysisId(String sessionId) {
        this.analysisId = sessionId;
    }

    public ProcessedTweet getTweet() {
        return tweet;
    }

    public void setTweet(ProcessedTweet tweet) {
        this.tweet = tweet;
    }
}
