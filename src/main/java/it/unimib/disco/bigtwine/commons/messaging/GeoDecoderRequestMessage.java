package it.unimib.disco.bigtwine.commons.messaging;

public class GeoDecoderRequestMessage {
    private String requestId;
    private String decoder = "default";
    private String[] addresses;

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

    public String[] getAddresses() {
        return addresses;
    }

    public void setAddresses(String[] addresses) {
        this.addresses = addresses;
    }
}
