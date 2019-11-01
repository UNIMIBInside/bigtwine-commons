package it.unimib.disco.bigtwine.commons.messaging.dto;

import java.io.Serializable;

public class LinkResolverExtraFieldDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String valuePath;
    private String saveAs;

    public LinkResolverExtraFieldDTO() {
    }

    public LinkResolverExtraFieldDTO(String valuePath, String saveAs) {
        this.valuePath = valuePath;
        this.saveAs = saveAs;
    }

    public String getValuePath() {
        return valuePath;
    }

    public void setValuePath(String valuePath) {
        this.valuePath = valuePath;
    }

    public String getSaveAs() {
        return saveAs;
    }

    public void setSaveAs(String saveAs) {
        this.saveAs = saveAs;
    }
}
