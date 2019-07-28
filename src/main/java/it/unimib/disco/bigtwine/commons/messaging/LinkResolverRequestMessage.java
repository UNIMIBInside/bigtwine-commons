package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.dto.LinkDTO;

public class LinkResolverRequestMessage implements RequestMessage {
    private String requestId;
    private String outputTopic;
    private LinkDTO[] links;

    public LinkResolverRequestMessage() {
    }

    public LinkResolverRequestMessage(String requestId, LinkDTO[] links) {
        this.requestId = requestId;
        this.links = links;
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
    public void setOutputTopic(String topicId) {
        this.outputTopic = topicId;
    }

    public LinkDTO[] getLinks() {
        return links;
    }

    public void setLinks(LinkDTO[] links) {
        this.links = links;
    }
}
