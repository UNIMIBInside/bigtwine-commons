package it.unimib.disco.bigtwine.commons.messaging;

public class Event {
    private String message;

    public Event() {
    }

    public String getMessage() {
        return message;
    }

    public Event setMessage(String message) {
        this.message = message;
        return this;
    }
}
