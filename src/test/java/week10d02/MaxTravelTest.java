package week10d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxTravelTest {

    @Test
    void getMaxIndex() {

        List<Integer> passengers = Arrays.asList(18,12,18,12,4,3,0,4,18);

        int actual = new MaxTravel().getMaxIndex(passengers);
        int expected = 18;

        assertEquals(expected, actual);
    }

    @Test
    public void invalidParamShouldThrowException() throws Exception {
        List<Integer> passengers = Arrays.asList(18,12,18,12,4,3,31,4,18);
        Exception ex =   assertThrows(IllegalArgumentException.class, () -> new MaxTravel().getMaxIndex(passengers));
        assertEquals("Invalid parameter!", ex.getMessage());
    }
}

