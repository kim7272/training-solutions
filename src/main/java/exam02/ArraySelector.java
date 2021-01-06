package exam02;

import java.util.ArrayList;
import java.util.List;

public class ArraySelector {

    public String selectEvens(int[] intArray) {
        List<Integer> evenItems = new ArrayList<>();
        for (int i = 0; i < intArray.length; i++) {
            if ((i + 2) % 2 == 0) {
                evenItems.add(intArray[i]);
            }
        }
        String evenItemsString = evenItems.toString();
        if (evenItemsString.isBlank()) {
            return "";
        } else {
            return evenItemsString;
        }
    }
}
