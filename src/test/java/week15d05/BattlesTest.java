package week15d05;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class BattlesTest {

    @Test
    void getHouse() {

        try (BufferedReader reader = Files.newBufferedReader(Path.of("battles.csv"));){

            String actual = new Battles().getHouse(reader);
            String expected = "Lannister";

            assertEquals(expected, actual);

        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read file!");
        }
    }
}