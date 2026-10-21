package com.zeter.util;

import java.util.ArrayList;
import java.util.List;

public class RefParser {
    /**
     * Parses a scripture reference into a list of verses
     * 
     * @param reference reference of verses. Can be a single verse, range of verses, or disjointed collection of verses, as well as different chapters or books
     * @return an ordered list containing the scripture references
     */
    public static List<String> parseRefPlain(String reference) {
        ArrayList<String> output = new ArrayList<>();

        // TODO something

        return output;
    }

    /**
     * Parses a scripture reference into a list of verses
     * 
     * @param reference URI href to a verse, where the URL is the book and chapter, and the query parameters is the verse
     * @return an ordered list containing the scripture references
     */
    public static List<String> parseRefUri(String uri) {
        ArrayList<String> output = new ArrayList<>();

        // TODO something

        return output;
    }
}
