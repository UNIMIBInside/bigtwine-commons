package it.unimib.disco.bigtwine.commons.models.dto;

import it.unimib.disco.bigtwine.commons.models.Link;
import java.io.Serializable;

public class LinkDTO implements Link, Serializable {
    private String tag;
    private String url;

    public LinkDTO() {
    }

    public LinkDTO(String url) {
        this.url = url;
    }

    public LinkDTO(String url, String tag) {
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
