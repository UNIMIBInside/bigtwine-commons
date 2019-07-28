package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.dto.ResourceDTO;

public class LinkResolverResponseMessage implements ResponseMessage {
    private String requestId;
    private ResourceDTO[] resources;

    public LinkResolverResponseMessage() {
    }

    public LinkResolverResponseMessage(String requestId, ResourceDTO[] resources) {
        this.requestId = requestId;
        this.resources = resources;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ResourceDTO[] getResources() {
        return resources;
    }

    public void setResources(ResourceDTO[] resources) {
        this.resources = resources;
    }
}
