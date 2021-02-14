package week12d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumberStatTest {

    @Test
    void numberOnlyOnce() {

        Integer[] a = new Integer[]{1, 1, 7, 5, 3, 4, 5, 6, 5, 6, 4, 1, 6, 5, 4};

        int actual = new NumberStat().numberOnlyOnce(Arrays.asList(a));
        int expected = 3;

        assertEquals(expected, actual);
    }
}