import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.zeter.util.RefParser;

public class TestRefParser {
    
    @Test // a single verse
    public void testSingleVerse() {
        String expectedOutput = "1 Nephi 3:7";

        List<String> output = RefParser.parseRefPlain(expectedOutput);

        assertEquals(1, output.size());
        assertEquals(expectedOutput, output.get(0));
    }

    @Test // a range of verses, such as "1–4"
    public void testVerseRange() {
        String testString = "Mosiah 18:8–10";

        String[] testArr = {"Mosiah 18:8", "Mosiah 18:9", "Mosiah 18:10"};

        List<String> output = RefParser.parseRefPlain(testString);

        assertEquals(3, output.size());
        for (int i = 0; i < testArr.length; i++) {
            assertEquals(testArr[i], output.get(i));
        }
    }

    @Test // multiple verses that are not connected, like "1, 3"
    public void testDisjointedVerses() {
        String testString = "Isaiah 41:1, 3";
    }

    @Test // multiple verses that are next to each other, but don't use a en dash like "1, 2"
    public void testAdjacientVerses() {

    }

    @Test // both multiple verses and a range of verses, like "1–3, 5"
    public void testRangeAndDisjointedVerses() {
        String testString = "D&C 121:36, 41–42";
    }

    @Test // verses with context, like "1 Nephi 1:1 (1–2)"
    public void testVersesWithContext() {
        String testString = "1 Nephi 1:1 (1–2)";
    }

    @Test // an entire chapter
    public void testEntireChapter() {

    }

    @Test // multiple chapters, like "1 Nephi 1:4; 2:8"
    public void testMultipleChapters() {

    }

    @Test // multiple chapters with verses
    public void testMultipleChaptersVerses() {

    }

    @Test // multiple books
    public void testMultipleBooks() {

    }
}
