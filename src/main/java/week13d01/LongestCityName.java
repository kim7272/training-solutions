package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LongestCityName {

    public String getLongestCityName(String filename) {

        Path path = Path.of(filename);
        String longestCity = " ";
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] names = line.split(";");

                    if (names[1].trim().length() > longestCity.length()) {
                        longestCity = names[1];
                    }

            }

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file!");
        }
        return longestCity;
    }

    public static void main(String[] args) {

        System.out.println(new LongestCityName().getLongestCityName("iranyitoszamok-varosok-2021.csv"));
    }
}
