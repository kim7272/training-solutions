 package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextAnalysisTest {

    @Test
    void letterCounter() {

        int actual = new TextAnalysis().letterCounter("a Br ! /akAd +ab ?R a");
        int expected = 5;

        assertEquals(expected, actual);
    }
}

