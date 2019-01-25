package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.DecodedLocation;

public class GeoDecoderResponseMessage implements ResponseMessage {
    private String requestId;
    private String decoder = "default";
    private DecodedLocation[] locations;

    public GeoDecoderResponseMessage() {
    }

    public GeoDecoderResponseMessage(String requestId, String decoder, DecodedLocation[] locations) {
        this.requestId = requestId;
        this.decoder = decoder;
        this.locations = locations;
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

    public DecodedLocation[] getLocations() {
        return locations;
    }

    public void setLocations(DecodedLocation[] locations) {
        this.locations = locations;
    }
}
