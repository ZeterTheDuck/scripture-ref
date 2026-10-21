package com.zeter.model;

import java.util.ArrayList;
import java.util.List;

import com.zeter.enums.Book;

/**
 * Representation of a single verse
 */
public class Verse {
    /** The book of scripture */
    private Book book;
    /** The chapter number */
    private int chapter;
    /** The verse number */
    private int verse;

    /**
     * A collection of footnotes.
     * 
     * <p>The index of the item in the list corresponds to the footnote letter:
     * <ul><li>0 -> a
     * <li>1 -> b
     * <li> 2 -> c
     * <li>and so on.</ul>
     */
    private List<Footnote> footnotes;

    /**
     * Constructor for a verse
     * 
     * @param book the book of scripture
     * @param chapter the chapter number
     * @param verse the verse number
     */
    public Verse(Book book, int chapter, int verse) {
        this.book = book;
        this.chapter = chapter;
        this.verse = verse;
        footnotes = new ArrayList<Footnote>();
    }

    /**
     * Gets a citation of this verse, for instance "1 Nephi 3:7"
     * 
     * @return a citation of this verse
     */
    public String toString() {
        return book.getName() + " " + chapter + ":" + verse;
    }

    /**
     * Adds a footnote to this verse
     * 
     * <p> Footnotes are ordered in the order they are added
     * 
     * @param footnote the footnote to add
     */
    public void addFootnote(Footnote footnote) {
        footnotes.add(footnote);
    }
}
