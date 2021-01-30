package week04d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    void getResult() {

        int actual = new Operation("18+23").getResult("18+23");

        assertEquals(41, actual);
    }
}