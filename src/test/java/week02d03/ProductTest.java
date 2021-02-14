package week02d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void areTheyEqual_1() {

        boolean actual = new Product("Apple","PQ31").areTheyEqual(new Product("Apple", "PQ312"));
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void areTheyEqual_2() {

        boolean actual = new Product("Apple","PQ31").areTheyEqual(new Product("Apple", "PQ3124"));
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    void areTheyEqual_3() {

        boolean actual = new Product("Potato","PQ31").areTheyEqual(new Product("Apple", "PQ3124"));
        boolean expected = false;

        assertEquals(expected, actual);
    }
}