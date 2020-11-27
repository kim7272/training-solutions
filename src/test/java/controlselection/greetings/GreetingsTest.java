package controlselection.greetings;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GreetingsTest {

    @Test
    public void DailyGreetingsTestMorning() {
        //Given
        String greetingExpected = "Jó reggelt";
        // When
        String greetingActual = new Greetings().dailyGreetings(8, 59);
        //Then
        assertEquals(greetingExpected, greetingActual);
    }
    @Test
    public void DailyGreetingsTestDay() {
        //Given
        String greetingExpected = "Jó napot";
        //When
        String greetingActual = new Greetings().dailyGreetings(18,29);
        //Then
        assertEquals(greetingExpected, greetingActual);
    }
    @Test
    public void DailyGreetingsTestEvening() {
        //Given
        String greetingExpected = "Jó estét";
        //When
        String greetingActual = new Greetings().dailyGreetings(19, 59);
        //Then
        assertEquals(greetingExpected, greetingActual);
    }

    @Test
    public void DailyGreetingsTestNight() {
        //Given
        String greetingExpected = "Jó éjszakát";
        //When
        String greetingActual = new Greetings().dailyGreetings(4, 59);
        //Then
        assertEquals(greetingExpected, greetingActual);
    }


}
