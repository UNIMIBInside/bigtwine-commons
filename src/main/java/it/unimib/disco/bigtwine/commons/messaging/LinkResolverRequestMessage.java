package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.Link;

public class LinkResolverRequestMessage implements RequestMessage {
    private String requestId;
    private String outputTopic;
    private Link[] links;

    public LinkResolverRequestMessage() {
    }

    public LinkResolverRequestMessage(String requestId, Link[] links) {
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

    public Link[] getLinks() {
        return links;
    }

    public void setLinks(Link[] links) {
        this.links = links;
    }
}
