package com.zeter.model;

import java.util.HashMap;

/**
 * Container of all verses.
 * 
 * <p> At some point this may be replaced with a MySQL database or JSON file
 * 
 */
public class VerseLibrary {
    /**
     * Backing map of all verses
     * 
     * <p> The key is the reference to the verse, such as "1 Nephi 3:7", obtained from {@link Verse#toString()}
     */
    private HashMap<String, Verse> verseMap;

    /**
     * Creates a new VerseLibrary with no data
     */
    public VerseLibrary() {
        verseMap = populateLibrary();
    }

    /**
     * Populates this object with a new crawl of all verses in the church website
     */
    private HashMap<String, Verse> populateLibrary() {
        // TODO crawl church site for all verses and populate verseMap
        return null; // STUB
    }

    /**
     * Gets a verse from a reference. The reference must be for a single verse; references for multiple verses or a range of verses will not work
     * 
     * @param reference reference of the verse
     * @return the verse associated with that reference, or <code>null</code> if it is not found
     */
    public Verse getVerse(String reference) {
        return verseMap.get(reference);
    }

}
