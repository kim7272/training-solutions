package algorithmssum.integers;

import java.util.ArrayList;
import java.util.List;

public class IntegerSumCalculator {

    List<Integer> numbers = new ArrayList<>();

    public int sum(List<Integer> numbers){

        int result = 0;
        for (int number : numbers){
            result += number;
        }
        return result;
    }
}
