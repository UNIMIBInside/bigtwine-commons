package it.unimib.disco.bigtwine.commons.models.dto;

import it.unimib.disco.bigtwine.commons.models.Coordinate;
import it.unimib.disco.bigtwine.commons.models.DecodedLocation;
import java.io.Serializable;

public class DecodedLocationDTO implements DecodedLocation, Serializable {
    private String tag;
    private String address;
    private Coordinate coordinates;

    public DecodedLocationDTO() {}

    public DecodedLocationDTO(String address, Coordinate coordinates) {
        this.address = address;
        this.coordinates = coordinates;
    }

    public DecodedLocationDTO(String address, Coordinate coordinates, String tag) {
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
        this.coordinates = new CoordinatesDTO(lat, lon);
    }
}
