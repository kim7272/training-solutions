package week07d03;

import org.junit.jupiter.api.Test;
import week07d02.DigitSum;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberListTest {


    @Test

    public void NumberListTestAscend(){

        assertEquals(true, new NumberList().isIncreasing(Arrays.asList(1, 2, 3, 4, 5)));

    }

    @Test

    public void NumberListTestDescend(){

        assertEquals(false, new NumberList().isIncreasing(Arrays.asList(1, 2, 3, 5, 4)));
    }

    @Test

    public void NumberListTestAscendWithEqual(){

        assertEquals(true, new NumberList().isIncreasing(Arrays.asList(1,2,3,3,4,5)));
    }

}
