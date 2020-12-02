package week06d03;

import java.util.Scanner;

public class WordEraser {

    public String eraseWord(String words, String word) {
        Scanner s = new Scanner(words);
        StringBuilder sb = new StringBuilder();
        String wordToCheck;
        while (s.hasNext()) {
            wordToCheck = s.next();
            if (wordToCheck == word){
                sb.append(" " + " ");
            } else {
                sb.append(" " + wordToCheck);
            }
        }
        String result = sb.toString();
        return result;
    }
    public static void main(String[] args) {
        System.out.println(new WordEraser().eraseWord("alma körte szilva datolya","szilva"));
    }
}
