package week14d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IndexerTest {

    @Test
    void index() {

        String actual = new Indexer().index(Arrays.asList("Elek", "Alfonz", "Döme", "Cecil", "Aladár", "Elemér")).toString();
        String expected = "{A=[Alfonz, Aladár], C=[Cecil], D=[Döme], E=[Elek, Elemér]}";

        assertEquals(expected, actual);
    }
}