package week04d02;

import java.util.ArrayList;
import java.util.List;



public class Search {

    public List<Integer> getIndexesOfChar(String string, char charValue) {

        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == charValue) {
                indexList.add(i + 1);
            }
        }
        return indexList;
    }
}
