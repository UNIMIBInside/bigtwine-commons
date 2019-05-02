package it.unimib.disco.bigtwine.commons.models.dto;

import it.unimib.disco.bigtwine.commons.models.Location;
import java.io.Serializable;

public class LocationDTO implements Location, Serializable {
    private String tag;
    private String address;

    public LocationDTO() {}

    public LocationDTO(String address) {
        this.address = address;
    }

    public LocationDTO(String address, String tag) {
        this(address);
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
}
