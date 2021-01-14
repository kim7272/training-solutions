package week11d03;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WorldFilterTest {

    @Test
    public void wordsWithCharTest() {

        List<String> givenValues = Arrays.asList("répa", "mit", "retek", "sütsz", "mogyoró");
        List<String> expectedValues = Arrays.asList("répa", "retek", "mogyoró");

        assertEquals(expectedValues, new WorldFilter().wordsWithChar(givenValues, 'r'));
    }

    @Test
    public void testGivenListWithNullValue() {

        List<String> givenValues = Arrays.asList("répa", "mit", "retek", "sütsz", "mogyoró");

        assertThrows(WorldFilterException.class, () -> {
            new WorldFilter().wordsWithChar(givenValues, '0');
        });
    }
}