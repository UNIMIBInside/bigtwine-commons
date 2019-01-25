package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.Address;

public class GeoDecoderResponseMessage implements ResponseMessage {
    private String requestId;
    private String decoder = "default";
    private Address[] addresses;

    public GeoDecoderResponseMessage() {
    }

    public GeoDecoderResponseMessage(String requestId, String decoder, Address[] addresses) {
        this.requestId = requestId;
        this.decoder = decoder;
        this.addresses = addresses;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getDecoder() {
        return decoder;
    }

    public void setDecoder(String decoder) {
        this.decoder = decoder;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }
}
