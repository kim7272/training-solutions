package week14d05;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HachikoFilmTest {

    @Test
    void countWords() {

        Path file = Path.of("hachiko.txt");

        String actual = new HachikoFilm().countWords(file, "Hachiko", "haza",
                "pályaudvar", "jó").toString();

        String expected = "{haza=16, Hachiko=4, jó=38, pályaudvar=6}";

        assertEquals(expected, actual);
    }
}