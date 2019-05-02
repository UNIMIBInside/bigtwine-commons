package it.unimib.disco.bigtwine.commons.models;


public interface Resource {
    String getTag();
    void setTag(String tag);
    
    String getName();
    void setName(String name);
    
    String getShortDesc();
    void setShortDesc(String shortDesc);
    
    String getThumb();
    void setThumb(String thumb);
    
    String getThumbLarge();
    void setThumbLarge(String thumbLarge);
    
    String getUrl();
    void setUrl(String url);
    
    Coordinate getCoordinates();
    void setCoordinates(Coordinate coordinates);
}
