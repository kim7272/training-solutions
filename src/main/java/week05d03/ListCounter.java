package week05d03;

import java.util.List;
import java.util.ArrayList;

public class ListCounter {


    public int countList(List<String> listToCheck) {
        int counter = 0;
        for (String item : listToCheck) {
            String itemSmall = item.toLowerCase();
            if (itemSmall.startsWith("a")) {
                counter = counter + 1;
            }

        }
        return counter;
    }
}
