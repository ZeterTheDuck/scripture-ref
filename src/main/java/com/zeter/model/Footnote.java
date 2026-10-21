package com.zeter.model;

import java.util.ArrayList;
import java.util.List;

import com.zeter.enums.FootnoteType;

import lombok.Getter;

/**
 * Representation of a footnote
 */
public class Footnote {
    /** The type of the footnote */
    @Getter 
    private FootnoteType type;
    /** The text of the footnote */
    @Getter
    private String text;
    /** References to other verses, if any */
    @Getter
    private List<CrossReference> references;

    /**
     * Creates a footnote from source text. References and footnote type are interpreted from the source text
     * 
     * @param text the text of the footnote
     */
    public Footnote(String text) {
        // STUB do something with RegEx to figure out the footnote type
        this.type = FootnoteType.NONE;

        // STUB this should remove the RegEx part
        this.text = text;

        // STUB add cross references from text
        references = new ArrayList<CrossReference>();
    }

    /**
     * Adds a reference to this footnote
     * 
     * @param reference the text of the reference, for instance "Mosiah 18:8–10"
     * @return true if the reference was processed and the footnote was added successfully, or false if it was not
     */
    public boolean addReference(String reference) {
        // STUB
        return false;
    }
}
