package it.unimib.disco.bigtwine.commons.models;

public class Link {
    private String tag;
    private String url;

    public Link() {
    }

    public Link(String url) {
        this.url = url;
    }

    public Link(String url, String tag) {
        this.tag = tag;
        this.url = url;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
