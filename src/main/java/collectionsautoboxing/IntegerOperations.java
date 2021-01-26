package collectionsautoboxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerOperations {


    public List<Integer> createList(int... numbers){

        List<Integer> listNumbers = new ArrayList<>();
        for (int number : numbers){
            listNumbers.add(number);
       }
        return listNumbers;
    }

    public int sumIntegerList(List<Integer> integerList){

        int sum = 0;
        for (int number : integerList){
            sum = sum + number;
        }
        return sum;
    }

    public int sumIntegerObjects(Integer... integers) {

        int sum = 0;
        for (int number : integers) {
            sum = sum + number;
        }
        return sum;
    }
}
