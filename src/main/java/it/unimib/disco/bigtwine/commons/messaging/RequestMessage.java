package it.unimib.disco.bigtwine.commons.messaging;

public interface RequestMessage {
    String getRequestId();
    void setRequestId(String requestId);
    String getOutputTopic();
    void setOutputTopic(String topicId);
}
