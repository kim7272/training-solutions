package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MathAlgorithmsTest {

    @Test

    public void IsPrimeNumber() {

        assertEquals(true, MathAlgorithms.isPrime(23));
    }

    @Test

    public void NotPrimeNumber() {

        assertEquals(false, MathAlgorithms.isPrime(18));
    }

    @Test
    public void NegativeValueShouldThrowException() throws IllegalArgumentException {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> MathAlgorithms.isPrime(-25));
        assertEquals("x should be a positive integer!", ex.getMessage());
    }
}

