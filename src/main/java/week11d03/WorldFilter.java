package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WorldFilter {

    List<String> wordsWithChar(List<String> words, char c) {
        try {
            List<String> selectedWords = new ArrayList<>();
            for (String word : words) {
                if (word.indexOf(c) != -1) {
                    selectedWords.add(word);
                }
            }
            return selectedWords;
        } catch (NullPointerException | IllegalArgumentException e) {
            throw new WorldFilterException("Invalid parameter!", e);
        }
    }
}
