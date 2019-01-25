package it.unimib.disco.bigtwine.commons.messaging;

public class LinkResolverRequestMessage {
    private String requestId;
    private String[] links;

    public LinkResolverRequestMessage() {
    }

    public LinkResolverRequestMessage(String requestId, String[] links) {
        this.requestId = requestId;
        this.links = links;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String[] getLinks() {
        return links;
    }

    public void setLinks(String[] links) {
        this.links = links;
    }
}
