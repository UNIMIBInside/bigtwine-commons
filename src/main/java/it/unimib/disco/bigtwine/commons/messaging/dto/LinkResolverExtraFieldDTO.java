package it.unimib.disco.bigtwine.commons.messaging.dto;

public class LinkResolverExtraFieldDTO {
    private String valuePath;
    private String saveAs;

    public LinkResolverExtraFieldDTO() {
    }

    public String getValuePath() {
        return valuePath;
    }

    public LinkResolverExtraFieldDTO setValuePath(String valuePath) {
        this.valuePath = valuePath;
        return this;
    }

    public String getSaveAs() {
        return saveAs;
    }

    public LinkResolverExtraFieldDTO setSaveAs(String saveAs) {
        this.saveAs = saveAs;
        return this;
    }
}
