package it.unimib.disco.bigtwine.commons.models.dto;

import it.unimib.disco.bigtwine.commons.models.TextRange;
import java.io.Serializable;

public class TextRangeDTO implements TextRange, Serializable {
    private int start;
    private int end;

    public TextRangeDTO() {
    }

    public TextRangeDTO(int start, int end) {
        if (start < 0 || end < 0 || end <= start) {
            throw new IllegalArgumentException("both end and start must be >= 0 and end must be > start");
        }
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        if (start < 0 || end <= start) {
            //throw new IllegalArgumentException("both end and start must be > 0 and end must be > start");
        }
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        if (end < 0 || end <= start) {
            //throw new IllegalArgumentException("both end and start must be > 0 and end must be > start");
        }
        this.end = end;
    }
}
