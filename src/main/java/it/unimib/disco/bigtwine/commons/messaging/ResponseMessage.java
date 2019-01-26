package it.unimib.disco.bigtwine.commons.messaging;

import java.io.Serializable;

public interface ResponseMessage extends Serializable {
    String getRequestId();
    void setRequestId(String requestId);
}
