package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.messaging.dto.PlainTextDTO;

public class NerRequestMessage implements RequestMessage {
    private String requestId;
    private String recognizer = "default";
    private PlainTextDTO[] texts;
    private String outputTopic;

    public NerRequestMessage() {
    }

    public NerRequestMessage(String requestId, String recognizer, PlainTextDTO[] texts) {
        this.requestId = requestId;
        this.recognizer = recognizer;
        this.texts = texts;
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

    public PlainTextDTO[] getTexts() {
        return texts;
    }

    public void setTexts(PlainTextDTO[] texts) {
        this.texts = texts;
    }
}
