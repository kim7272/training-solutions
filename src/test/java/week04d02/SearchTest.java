package week04d02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    @Test
    void getIndexesOfChar() {

        String actual = new Search().getIndexesOfChar("abrakadabra", 'a').toString();
        String expected = "[1, 4, 6, 8, 11]";

        assertEquals(expected,actual);
    }
}