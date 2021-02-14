package week11d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileSumTest {

    @Test
    void sumNumbers() {

        FileSum fileSum = new FileSum();

        int actual = new FileSum().sumNumbers();
        int expected = 313;

        assertEquals(expected, actual);
    }
}