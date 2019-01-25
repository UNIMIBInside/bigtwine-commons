package it.unimib.disco.bigtwine.commons.messaging;

public interface ResponseMessage {
    String getRequestId();
    void setRequestId(String requestId);
}
