package com.zeter.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representation of a cross reference
 */
public class CrossReference {
    private List<Verse> references;

    /**
     * Default constructor. Creates a cross reference with no referenced verses
     */
    public CrossReference() {
        references = new ArrayList<Verse>();
    }

    /**
     * Creates a cross reference
     * 
     * <p> Might not create a reference if the input string is not parsed correctly
     * 
     * @param reference the text of a reference
     */
    public CrossReference(String reference) {
        this();
        setVerses(reference);
    }

    /**
     * Sets the verses for this reference
     * 
     * @param reference the text of the reference, for instance "Mosiah 18:8–10"
     * @return true if the reference was parsed and the footnote was added successfully, or false if it was not
     */
    public boolean setVerses(String reference) {
        List<Verse> oldReferences = new ArrayList<>(references);
    
        // TODO something

        // STUB behavior whether reference is added correctly or not
        if (false) {
            return true;
        } else {
            references = new ArrayList<>(oldReferences);
            return false;
        }
    }
}
