package week13d04;

import org.junit.jupiter.api.Test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Path;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TemplateMergerTest {

    @Test
    void merge() {
        Path file = Path.of("employeeForm.txt");

        /*StringWriter expectedStringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(expectedStringWriter);
        printWriter.println("Az alkalmazott neve: John Doe, születési éve: 1980");
        printWriter.println("Az alkalmazott neve: Jack Doe, születési éve: 1990");
        printWriter.close();
         */

        String expected = "Az alkalmazott neve: John Doe, születési éve: 1980\n" +
                "Az alkalmazott neve: Jack Doe, születési éve: 1990".replaceAll("\\n", System.getProperty("line.separator"));


     //   String expected =   expectedStringWriter.toString();

        String actual = new TemplateMerger().merge(file, Arrays.asList(new Employee("John Doe","1980"),
                new Employee("Jack Doe","1990")));

        assertEquals(expected, actual);
    }
}