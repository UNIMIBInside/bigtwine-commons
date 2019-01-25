package it.unimib.disco.bigtwine.commons.messaging;

import it.unimib.disco.bigtwine.commons.models.Location;

public class GeoDecoderRequestMessage implements RequestMessage {
    private String requestId;
    private String outputTopic;
    private String decoder = "default";
    private Location[] locations;

    public GeoDecoderRequestMessage() {
    }

    public GeoDecoderRequestMessage(String requestId, String decoder, Location[] locations) {
        this.requestId = requestId;
        this.decoder = decoder;
        this.locations = locations;
    }

    public GeoDecoderRequestMessage(String requestId, String decoder, Location[] locations, String outputTopicId) {
        this(requestId, decoder, locations);
        this.outputTopic = outputTopicId;
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
    public void setOutputTopic(String outputTopic) {
        this.outputTopic = outputTopic;
    }

    public String getDecoder() {
        return decoder;
    }

    public void setDecoder(String decoder) {
        this.decoder = decoder;
    }

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }
}
