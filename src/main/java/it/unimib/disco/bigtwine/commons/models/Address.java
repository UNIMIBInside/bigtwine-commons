package it.unimib.disco.bigtwine.commons.models;

public class Address {
    private String address;
    private Coordinate coordinates;

    public Address() {}

    public Address(String address, Coordinate coordinates) {
        this.address = address;
        this.coordinates = coordinates;
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
