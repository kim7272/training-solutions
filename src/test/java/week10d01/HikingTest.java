package week10d01;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HikingTest {

    @Test

    public void getPlusElevationTest(){

        assertEquals(13.0,new Hiking().getPlusElevation(Arrays.asList(10.0,20.0,15.0,18.0)));
    }
}
