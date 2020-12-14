package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {

    @Test
    public void testRobotPosition() {

        Robot robot = new Robot();

        String position = "X: " + new Robot().move("FFLLLLLBBBBJJJJJJJ")[0] + ", " + "Y: " + new Robot().move("FFLLLLLBBBBJJJJJJJ")[1];
        String expected = "X: 3, Y: -3";

        assertEquals(expected, position);
    }


}
