package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.messaging.dto.RecognizedTextDTO;

public class NelRequestMessage implements RequestMessage {
    private String requestId;
    private String outputTopic;
    private String linker = "default";
    private RecognizedTextDTO[] texts;

    public NelRequestMessage() {
    }

    public NelRequestMessage(String requestId, String linker, RecognizedTextDTO[] texts) {
        this.requestId = requestId;
        this.linker = linker;
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

    public String getLinker() {
        return linker;
    }

    public void setLinker(String linker) {
        this.linker = linker;
    }

    public RecognizedTextDTO[] getTexts() {
        return texts;
    }

    public void setTexts(RecognizedTextDTO[] texts) {
        this.texts = texts;
    }
}
