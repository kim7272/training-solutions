package week10d05;

import org.junit.jupiter.api.Test;
import schoolrecords.Mark;
import schoolrecords.MarkType;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void findMinSumExceptionTest(){

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Calculator().findMinSum(new int[] {9,7,5}));
        assertEquals("Array should contain at least 4 elements!", ex.getMessage());
    }

    @Test
    public void findMinSumTest(){
        assertEquals(11, new Calculator().findMinSum(new int[] {5,3,1,2}));
    }
}