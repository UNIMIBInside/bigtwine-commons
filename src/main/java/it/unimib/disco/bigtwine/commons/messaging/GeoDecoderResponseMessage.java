package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.Address;

public class GeoDecoderResponseMessage {
    private String requestId;
    private String decoder = "default";
    private Address[] addresses;
}
