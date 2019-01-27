package it.unimib.disco.bigtwine.commons.models;

import java.io.Serializable;

public class Resource implements Serializable {
    private String tag;
    private String name;
    private String shortDesc;
    private String thumb;
    private String thumbLarge;
    private String url;
    private Coordinate coordinates;

    public Resource() {
    }

    public Resource(String name, String shortDesc, String thumb, String thumbLarge, String url, Coordinate coordinates) {
        this.name = name;
        this.shortDesc = shortDesc;
        this.thumb = thumb;
        this.thumbLarge = thumbLarge;
        this.url = url;
        this.coordinates = coordinates;
    }

    public Resource(String name, String shortDesc, String thumb, String thumbLarge, String url, Coordinate coordinates, String tag) {
        this(name, shortDesc, thumb, thumbLarge, url, coordinates);
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getThumbLarge() {
        return thumbLarge;
    }

    public void setThumbLarge(String thumbLarge) {
        this.thumbLarge = thumbLarge;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Coordinate getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinate coordinates) {
        this.coordinates = coordinates;
    }
}