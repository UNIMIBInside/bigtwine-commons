package it.unimib.disco.bigtwine.commons.models;

public interface DecodedLocation {
    String getTag();
    void setTag(String tag);
    
    String getAddress();
    void setAddress(String address);
    
    Coordinate getCoordinates();
    void setCoordinates(Coordinate coordinates);
    void setCoordinates(double lat, double lon);
}
