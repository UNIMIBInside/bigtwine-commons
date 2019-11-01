package it.unimib.disco.bigtwine.commons.messaging.dto;

public class LinkResolverExtraFieldDTO {
    private String valuePath;
    private String saveAs;

    public LinkResolverExtraFieldDTO() {
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
