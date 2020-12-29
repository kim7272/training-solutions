 package week09d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibCalculatorTest {

    @Test
    public void sumTest(){

        assertEquals(44,new FibCalculator().sumEvens(34));
    }

}

