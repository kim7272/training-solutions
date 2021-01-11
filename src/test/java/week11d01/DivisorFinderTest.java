package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorFinderTest {

    @Test
    void findDivisors() {

        int actual = new DivisorFinder().findDivisors(425);
        int expected = 1;

        assertEquals(expected, actual);

    }
}