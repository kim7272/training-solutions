package week05d03;

import java.util.List;
import java.util.ArrayList;

public class ListCounter {

    int counter = 0;

    public int countList(List<String> listToCheck) {
        for (String item : listToCheck) {
            String itemSmall = item.toLowerCase();
            if (itemSmall.startsWith("a")) {
                counter = counter + 1;
            }

        }
        return counter;
    }
}
