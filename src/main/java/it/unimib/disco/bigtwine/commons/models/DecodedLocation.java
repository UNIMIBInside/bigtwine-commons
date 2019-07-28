package it.unimib.disco.bigtwine.commons.models;

import it.unimib.disco.bigtwine.commons.models.dto.CoordinatesDTO;

public interface DecodedLocation {
    String getTag();
    void setTag(String tag);
    
    String getAddress();
    void setAddress(String address);

    CoordinatesDTO getCoordinates();
    void setCoordinates(CoordinatesDTO coordinates);
    void setCoordinates(double lat, double lon);
}
