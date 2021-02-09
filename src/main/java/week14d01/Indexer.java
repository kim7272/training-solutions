package week14d01;

import java.util.*;

public class Indexer {

    public Map<Character, List<String>> index(List<String> names) {

        Map<Character, List<String>> result = new HashMap<>();

        for (String name : names) {
            Character init = name.charAt(0);
            if (!result.containsKey(init)) {
                result.put(init, new ArrayList<>());
                result.get(init).add(name);
            } else {
                result.get(init).add(name);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Indexer().index(Arrays.asList("Elek", "Alfonz", "Döme", "Cecil", "Aladár", "Elemér")));
    }
}
