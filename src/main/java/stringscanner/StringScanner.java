package stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringScanner {

    public int readAndSumValues(String intString, String delimiter){
        if (isEmpty(delimiter) && intString.contains(":")){
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        else if (isEmpty(delimiter)){
            delimiter = " ";
        }
        int sum = 0;
        Scanner s = new Scanner(intString).useDelimiter(delimiter);
        while (s.hasNextInt()){
            sum = sum + s.nextInt();
        }
        if (sum == 0){
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        return sum;
    }


    public int readAndSumValues(String intString){
        String[] parts = intString.split(" ");
        int sum = 0;
        Scanner s = new Scanner(intString);
        while (s.hasNextInt()){
            sum = sum + s.nextInt();
        }
        return sum;
    }

    public String filterLinesWithWordOccurrences(String text, String word) {
        String result = "";
        try {
            if (isEmpty(text) || word.isEmpty()) {
                throw new IllegalArgumentException("Incorrect parameter string!");
            }
        } catch (NullPointerException npe) {
            throw new IllegalArgumentException("Incorrect parameter string!", npe);
        }
        if (!text.contains(word) || word.isBlank()){
            result = "";
        }
        else {
            List<String> lines = new ArrayList<>();
            result = "";
            Scanner s = new Scanner(text);
            while (s.hasNextLine()) {
                lines.add(s.nextLine());
            }
            for (String line : lines) {
                if (line.contains(word)) {
                    result = result + line + "\n";
                }

            }
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }


    public boolean isEmpty(String item){
        return (item == null || item.isBlank());
    }
}
