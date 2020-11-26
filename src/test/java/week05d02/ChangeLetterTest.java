 package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

    @Test

    public void ChangeLetterTest() {
        //Given
        String textforChange = "Seremetyevo airport";

        //When
        String textForChange = new ChangeLetter().changeWovels(textforChange);

        //Then
        assertEquals("s*r*m*ty*v* **rp*rt", textForChange);
    }
    @Test

    public void ChangeLetterTest2(){
        //Given
        String textforChange = "SEREMETYEVO AIRPORT";

        //When
        String textForChange = new ChangeLetter().changeWovels(textforChange);

        //Then
        assertEquals("s*r*m*ty*v* **rp*rt", textForChange);

    }

}
