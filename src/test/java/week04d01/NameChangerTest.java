package week04d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameChangerTest {


    @Test
    public void processingNullParamShouldThrowException() throws Exception {
      Exception ex =   assertThrows(IllegalArgumentException.class, () -> new NameChanger(null));
        assertEquals("Invalid name null!", ex.getMessage());
    }

    @Test
    public void processingEmptyParamShouldThrowException() throws Exception {
        Exception ex2 =   assertThrows(IllegalArgumentException.class, () -> new NameChanger(""));
        assertEquals("Invalid name !", ex2.getMessage());
    }

    @Test
    void changeFirstName() {

        String actual = new NameChanger("Kovács Béla").changeFirstName("Szabó");

        assertEquals("Szabó Béla",actual);
    }

}