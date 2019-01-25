package it.unimib.disco.bigtwine.commons.messaging;

public class GeoDecoderRequestMessage implements RequestMessage {
    private String requestId;
    private String outputTopic;
    private String decoder = "default";
    private String[] addresses;

    public GeoDecoderRequestMessage() {
    }

    public GeoDecoderRequestMessage(String requestId, String decoder, String[] addresses) {
        this.requestId = requestId;
        this.decoder = decoder;
        this.addresses = addresses;
    }

    public GeoDecoderRequestMessage(String requestId, String decoder, String[] addresses, String outputTopicId) {
        this(requestId, decoder, addresses);
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

    public String[] getAddresses() {
        return addresses;
    }

    public void setAddresses(String[] addresses) {
        this.addresses = addresses;
    }
}
