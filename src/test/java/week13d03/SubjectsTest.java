package week13d03;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class SubjectsTest {

    @Test
    void lessonsByTeacher() {

        try (BufferedReader reader = Files.newBufferedReader(Path.of("beosztas.txt"))) {

            Subjects subjects = new Subjects();
            subjects.readLines(reader);

            int actual = subjects.lessonsByTeacher("Albatrosz Aladin");
            int expected = 24;

            assertEquals(expected, actual);

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}