package com.zeter.enums;

public enum Book {
    // Old Testament
    GENESIS("/ot/gen", "GEN", "Genesis"),
    EXODUS("/ot/ex", "EXO", "Exodus"),
    LEVITICUS("/ot/lev", "LEV", "Leviticus"),
    NUMBERS("/ot/num", "NUM", "Numbers"),
    DEUTERONOMY("/ot/deut", "DEU", "Deuteronomy"),
    JOSHUA("/ot/josh", "JOS", "Joshua"),
    JUDGES("/ot/judg", "JDG", "Judges"),
    RUTH("/ot/ruth", "RTH", "Ruth"),
    SAMUEL_1("/ot/1-sam", "SAM", "1 Samuel"),
    SAMUEL_2("/ot/2-sam", "SAM", "2 Samuel"),
    KINGS_1("/ot/1-kgs", "KIN", "1 Kings"),
    KINGS_2("/ot/2-kgs", "KIN", "2 Kings"),
    CHRONICLES_1("/ot/1-chr", "CHR", "1 Chronicles"),
    CHRONICLES_2("/ot/2-chr", "CHR", "2 Chronicles"),
    EZRA("/ot/ezra", "EZA", "Ezra"),
    NEHEMIAH("/ot/neh", "NEH", "Nehemiah"),
    ESTHER("/ot/esth", "EST", "Esther"),
    JOB("/ot/job", "JOB", "Job"),
    PSALMS("/ot/ps", "PSM", "Psalm"), // technically not the name, but this will be what's used later
    PROVERBS("/ot/prov", "PRO", "Proverb"), // technically not the name, but this will be what's used later
    ECCLESIASTES("/ot/eccl", "ECL", "Ecclesiastes"),
    SONG_SOLOMON("/ot/song", "SS", "Song of Solomon"),
    ISAIAH("/ot/isa", "ISA", "Isaiah"),
    JEREMIAH("/ot/jer", "JER", "Jeremiah"),
    LAMENTATIONS("/ot/lam", "LAM", "Lamentations"),
    EZEKIEL("/ot/ezek", "EZK", "Ezekiel"),
    DANIEL("/ot/dan", "DAN", "Daniel"),
    HOSEA("/ot/hosea", "HOS", "Hosea"),
    JOEL("/ot/joel", "JOL", "JOEL"),
    AMOS("/ot/amos", "AMO", "Amos"),
    OBADIAH("/ot/obad", "OBA", "Obadiah"),
    JONAH("/ot/jonah", "JNA", "Jonah"),
    MICAH("/ot/micah", "MIC", "Micah"),
    NAHUM("/ot/nahum", "NAH", "Nahum"),
    HABAKKUK("/ot/hab", "HAB", "Habakkuk"),
    ZEPHANIAH("/ot/zeph", "ZPH", "Zephaniah"),
    HAGGAI("/ot/hag", "HAG", "Haggai"),
    ZECHARIAH("/ot/zech", "ZCH", "Zechariah"),
    MALACHI("/ot/mal", "MAL", "Malachi"),

    // New Testament
    MATTHEW("/nt/matt", "MAT", "Matthew"),
    MARK("/nt/mark", "MRK", "Mark"),
    LUKE("/nt/luke", "LUK", "Luke"),
    JOHN("/nt/john", "JHN", "John"),
    ACTS("/nt/acts", "ACTS", "Acts"),
    ROMANS("/nt/rom", "ROM", "Romans"),
    CORINTHIANS_1("/nt/1-cor", "COR", "1 Corinthians"),
    CORINTHIANS_2("/nt/2-cor", "COR", "2 Corinthians"),
    GALATIANS("/nt/gal", "GAL", "Galatians"),
    EPHESIANS("/nt/eph", "EPH", "Ephesians"),
    PHILIPPIANS("/nt/philip", "PHL", "Philippians"),
    COLOSSIANS("/nt/col", "COL", "Colossians"),
    THESSALONIANS_1("/nt/1-thes", "THS", "1 Thessalonians"),
    THESSALONIANS_2("/nt/2-thes", "THS", "2 Thessalonians"),
    TIMOTHY_1("/nt/1-tim", "TIM", "1 Timothy"),
    TIMOTHY_2("/nt/2-tim", "TIM", "2 Timothy"),
    TITUS("/nt/titus", "TIT", "Titus"),
    PHILEMON("/nt/philem", "PHM", "Philemon"),
    HEBREWS("/nt/heb", "HEB", "Hebrews"),
    JAMES("/nt/james", "JAS", "James"),
    PETER_1("/nt/1-pet", "PET", "1 Peter"),
    PETER_2("/nt/2-pet", "PET", "2 Peter"),
    JOHN_1("/nt/1-jn", "JHN", "1 John"),
    JOHN_2("/nt/2-jn", "JHN", "2 John"),
    JOHN_3("/nt/3-jn", "JHN", "3 John"),
    JUDE("/nt/jude", "JUD", "Jude"),
    REVELATION("/nt/rev", "REV", "Revelation"),

    // Book of Mormon
    NEPHI_1("/bofm/1-ne", "1NE", "1 Nephi"),
    NEPHI_2("/bofm/2-ne", "2NE", "2 Nephi"),
    JACOB("/bofm/jacob", "JAC", "Jacob"),
    ENOS("/bofm/enos", "ENO", "Enos"),
    JAROM("/bofm/jarom", "JAR", "Jarom"),
    OMNI("/bofm/omni", "OMN", "Omni"),
    WORDS_MORMON("/bofm/w-of-m", "WMN", "Words of Mormon"),
    MOSIAH("/bofm/mosiah", "MSH", "Mosiah"),
    ALMA("/bofm/alma", "ALM", "Alma"),
    HELAMAN("/bofm/hel", "HEL", "Helaman"),
    NEPHI_3("/bofm/3-ne", "3NE", "3 Nephi"),
    NEPHI_4("/bofm/4-ne", "4NE", "4 Nephi"),
    MORMON("/bofm/morm", "MOR", "Mormon"),
    ETHER("/bofm/ether", "ETH", "Ether"),
    MORONI("/bofm/moro", "MNI", "Moroni"),

    // Doctrine and Covenants
    DOCTRINE_AND_COVENANTS("/dc-testament/dc", "D&C", "Doctrine and Covenants"),

    // Pearl of Great Price
    MOSES("/pgp/moses", "MOS", "Moses"),
    ABRAHAM ("/pgp/abr", "ABR", "Abraham"),
    JS_MATTHEW("/pgp/js-m", "JS", "Joseph Smith—Matthew"),
    JS_HISTORY("/pgp/js-h", "JS", "Joseph Smith—History"),
    ARTICLES_OF_FAITH("/pgp/a-of-f", "", "Articles of Faith");

    /** The path to this book, relative to <code>/scriptures</code> */
    private final String path;

    /** The abbreviation used for this book */
    private final String abbreviation;

    /** The name of this book, in English */
    private final String name;

    /**
     * Representation of a book of scripture
     * 
     * @param path path of this book, relative to <code>/scriptures</code>
     * @param abbreviation abbreviation used for this book
     * @param name name of this book, in English
     */
    Book(String path, String abbreviation, String name) {
        this.path = path;
        this.abbreviation = abbreviation;
        this.name = name;
    }

    /**
     * Gets the URI of this book
     * 
     * @return the URI pointing to this book
     */
    public String getUri() {
        return "/scriptures" + this.path;
    }

    /**
     * Gets the abbreviation used for this book
     * 
     * @return the abbreviation used for this book
     */
    public String getAbbreviation() {
        return this.abbreviation;
    }

    /**
     * Gets the name of this book in English
     * 
     * @return name of this book
     */
    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }

}
