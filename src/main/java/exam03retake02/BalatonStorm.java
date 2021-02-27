package exam03retake02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.*;

public class BalatonStorm {


    public List<String> getStationsInStorm(BufferedReader reader) throws IOException {
        String line;
        int counter = 0;
        Map<Integer, String> units = new HashMap<>();
        List<String> results = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            counter = counter + 1;
            units.put(counter, line);
            if (line.contains("level") && line.contains(Integer.toString(3))) {
                String  element = units.get(counter-4);
                String[] parts = element.split(":");
                String corr = parts[1].substring(2,parts[1].length()-2);

                results.add(corr);
            }
        }
        Collections.sort(results, Collator.getInstance(new Locale("hu","HU")));
        System.out.println(results);
            return results;
    }

    public static void main(String[] args) {
        BalatonStorm balatonStorm = new BalatonStorm();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(BalatonStorm.class.getResourceAsStream("storm.json")))) {
            System.out.println(new BalatonStorm().getStationsInStorm(reader));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
