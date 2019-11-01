package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.messaging.dto.LinkDTO;
import it.unimib.disco.bigtwine.commons.messaging.dto.LinkResolverExtraFieldDTO;

public class LinkResolverRequestMessage implements RequestMessage {
    private String requestId;
    private String outputTopic;
    private LinkDTO[] links;
    private LinkResolverExtraFieldDTO[] extraFields;

    public LinkResolverRequestMessage() {
    }

    public LinkResolverRequestMessage(String requestId, LinkDTO[] links) {
        this.requestId = requestId;
        this.links = links;
    }

    public LinkResolverRequestMessage(String requestId, LinkDTO[] links, LinkResolverExtraFieldDTO[] extraFields) {
        this(requestId, links);
        this.extraFields = extraFields;
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

    public LinkResolverExtraFieldDTO[] getExtraFields() {
        return extraFields;
    }

    public void setExtraFields(LinkResolverExtraFieldDTO[] extraFields) {
        this.extraFields = extraFields;
    }
}
