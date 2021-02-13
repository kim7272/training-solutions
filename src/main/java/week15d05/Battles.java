 package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Battles {

        public String getHouse(BufferedReader reader) throws IOException {
            String line;
            reader.readLine();
            Set<String> houses = new HashSet<>();
            Map<String, Integer> housesWithBattles = new HashMap<>();
            while ((line = reader.readLine()) != null) {
                String[] items = line.split(",");
                for (int i = 5; i < 13; i++) {
                    if (!items[i].isEmpty()) {
                        houses.add(items[i]);
                    }
                    for (String house : houses) {
                        if (items[i].contains(house)){
                            if (housesWithBattles.containsKey(house)) {
                                housesWithBattles.put(house, housesWithBattles.get(house) + 1);
                            } else {
                                housesWithBattles.put(house, 1);
                            }
                        }
                    }
                }
            }
            System.out.println(housesWithBattles);
            int max = 0;
            String houseMax = null;
            for (Map.Entry<String, Integer> entry: housesWithBattles.entrySet()) {
                if (entry.getValue() > max){
                    max = entry.getValue();
                    houseMax = entry.getKey();
                }
            }
            return houseMax;
        }

        public static void main(String[] args) {
            try (BufferedReader reader = Files.newBufferedReader(Path.of("battles.csv"))) {
                System.out.println(new Battles().getHouse(reader));
            } catch (IOException ioe) {
                throw new IllegalStateException("Can not read file", ioe);
            }
        }
    }




