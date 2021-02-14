package week12d03_pro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberStat {

    public int smallestSoleNumber(List<Integer> numbers) {

        List<Integer> soleNumbers = new ArrayList<>();
        int result = 0;
        boolean found = false;

        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List should contain at least one element!");
        }

        Collections.sort(numbers);

        if (numbers.get(0) != numbers.get(1)) {
            result = numbers.get(0);
            return result;
        }
        int i = 2;

        while (found == false) {
          if (numbers.get(i) != numbers.get(i + 1) && numbers.get(i) != numbers.get(i - 1)) {
             found = true;
             result = numbers.get(i);
          }
          else {
             i++;
          }
        }
        return result;
    }
}


