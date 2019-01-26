package it.unimib.disco.bigtwine.commons.models;

import java.io.Serializable;

public class DecodedLocation implements Serializable {
    private String tag;
    private String address;
    private Coordinate coordinates;

    public DecodedLocation() {}

    public DecodedLocation(String address, Coordinate coordinates) {
        this.address = address;
        this.coordinates = coordinates;
    }

    public DecodedLocation(String address, Coordinate coordinates, String tag) {
        this(address, coordinates);
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Coordinate getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinate coordinates) {
        this.coordinates = coordinates;
    }

    public void setCoordinates(double lat, double lon) {
        this.coordinates = new Coordinate(lat, lon);
    }
}
