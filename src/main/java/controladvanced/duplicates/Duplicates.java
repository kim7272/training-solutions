package controladvanced.duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Duplicates {

        public List<Integer> find(List<Integer> numbers){
            Collections.sort(numbers);
            List<Integer> multipleNumbers = new ArrayList<>();

                for (int j = 0; j < numbers.size()-1; j++) {
                    if (numbers.get(j) == numbers.get(j+1)) {
                        multipleNumbers.add(numbers.get(j));
                    }
                    continue;
                }
            return multipleNumbers;
        }
    }
