package week13d05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextAnalysis {

    public int letterCounter(String word){

        word = word.toLowerCase();
        String newWord = word.replaceAll("[^A-Za-z]+","");

        String[] newWordParts = newWord.split("");

        Arrays.sort(newWordParts);

        List<String> letters = new ArrayList<>();
        letters.add(newWordParts[0]);

        for (int i = 1; i < newWordParts.length; i++){
            if (!newWordParts[i].equals(newWordParts[i-1])){
                letters.add(newWordParts[i]);
            }
        }
        return letters.size();
    }

    public static void main(String[] args) {
        System.out.println(new TextAnalysis().letterCounter("Ab ! B ( ] ra K + 4 d"));
    }
}
