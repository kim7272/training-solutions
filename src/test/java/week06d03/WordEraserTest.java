package week06d03;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WordEraserTest {

    @Test

    public void EraseWordTest() {
        //Given
        String expectedRemainingWords = "anaconda cat dog";

        //When
        String actualRemainingWords = new WordEraser().eraseWord("anaconda bear cat dog","bear");

        //Then
        assertEquals(expectedRemainingWords, actualRemainingWords);

    }
}

