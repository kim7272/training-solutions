package week05d03;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListCounterTest {

    @Test
    public void countListTest(){
        //Given
        List<String> listToCheck = Arrays.asList("alma", "ata", "laca", "mama", "arte");

        //When
        int count = new ListCounter().countList(listToCheck);

        //Then
        assertEquals(3, count);

    }

    @Test
    public void countListTest2() {
        //Given
        List<String> listToCheck = Arrays.asList("Alma", "ata", "laca", "mama", "Arte");

        //When
        int count = new ListCounter().countList(listToCheck);

        //Then
        assertEquals(3, count);
    }

    @Test
    public void countListTest3() {
        //Given
        List<String> listToCheck = Arrays.asList("");

        //When
        int count = new ListCounter().countList(listToCheck);

        //Then
        assertEquals(0, count);
    }
}

