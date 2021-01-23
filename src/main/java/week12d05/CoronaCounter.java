package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CoronaCounter {

    public int wordCounter(String name) {

        int counter = 0;
        Path file = Path.of(name);
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("koronavírus")){
                    counter = counter + 1;
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file!", e);
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(new CoronaCounter().wordCounter("Index.html"));
    }
}
