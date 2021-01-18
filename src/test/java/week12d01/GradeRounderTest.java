package week12d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GradeRounderTest {

    @Test
    void roundGrades() {

       int[] grades = new int[] {38,39,43,46,51,58};

       int[] actual =  new GradeRounder().roundGrades(grades);
       int[] expected = new int[] {38,39,45,46,51,60};

       assertEquals(Arrays.toString(expected),Arrays.toString(actual));
    }

    @Test
    public void testWithNullArray() {
        Exception ex = assertThrows(NullPointerException.class, () -> new GradeRounder().roundGrades(null));
        assertEquals("Invalid parameter!", ex.getMessage());
    }

}