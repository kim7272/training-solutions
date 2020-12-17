package week08d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {

    @Test
    public void testGoodMood(){

        assertEquals(5, new Trainer(new GoodMood()).giveMark());
    }

    @Test
    public void testBadMood(){

        assertEquals(3, new Trainer(new BadMood()).giveMark());
    }
}

