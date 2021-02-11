package week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class HachikoFilm {

    Path file = Path.of("hachiko.txt");


    public Map<String, Integer> countWords(Path file, String ... words){

        Map<String, Integer> result = new HashMap<>();

        try (BufferedReader reader = Files.newBufferedReader(file)) {

            String line;
            int counter = 0;

            while ((line = reader.readLine()) != null) {
                for (String word : words) {
                    if (line.toLowerCase().contains(word.toLowerCase())) {
                        if (result.containsKey(word)) {
                            result.put(word, result.get(word) + 1);
                        } else {
                            result.put(word, 1);
                        }
                    }
                }
            }
        }
            catch (IOException e) {
            throw new IllegalArgumentException("Can not read file!", e);
        }
        return result;
    }

   public static void main(String[] args) {

        Path file = Path.of("hachiko.txt");
        System.out.println(new HachikoFilm().countWords(file,  "Hachiko", "haza",
                "pályaudvar", "jó"));
    }
}
