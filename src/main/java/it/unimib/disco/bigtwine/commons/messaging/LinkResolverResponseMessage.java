package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.Resource;

public class LinkResolverResponseMessage {
    private String requestId;
    private Resource[] resources;

    public LinkResolverResponseMessage() {
    }

    public LinkResolverResponseMessage(String requestId, Resource[] resources) {
        this.requestId = requestId;
        this.resources = resources;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Resource[] getResources() {
        return resources;
    }

    public void setResources(Resource[] resources) {
        this.resources = resources;
    }
}
