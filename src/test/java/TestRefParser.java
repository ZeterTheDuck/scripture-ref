import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.zeter.util.RefParser;

public class TestRefParser {
    
    @Test 
    public void testSingleVerse() {
        String expectedOutput = "1 Nephi 3:7";

        List<String> output = RefParser.parseRef(expectedOutput);

        assertEquals(1, output.size());
        assertEquals(expectedOutput, output.get(0));
    }

    @Test 
    public void testVerseRange() {
        String testString = "Mosiah 18:8–10";

        String[] testArr = {"Mosiah 18:8", "Mosiah 18:9", "Mosiah 18:10"};

        List<String> output = RefParser.parseRef(testString);

        assertEquals(3, output.size());
        for (int i = 0; i < testArr.length; i++) {
            assertEquals(testArr[i], output.get(i));
        }
    }
}
