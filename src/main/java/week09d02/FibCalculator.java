package week09d02;


import java.util.ArrayList;
import java.util.List;

public class FibCalculator {

    private List<Long> fibNumbers = new ArrayList<>();

    public long sumEvens(int bound) {
        long result = 0;
        if (bound == 0) {
            return 0;
        } else {
            for (int i = 1; ; i++) {
                if (new Fibonacci().fin(i) <= bound) {
                    fibNumbers.add(new Fibonacci().fin(i));
                }
                else  {
                    break;
                }
            }
            for (long fibNumber : fibNumbers) {
                if (fibNumber % 2 == 0) {
                    result = result + fibNumber;
                }
            }
            return result;
        }
    }
     public static void main(String[] args) {
         System.out.println(new FibCalculator().sumEvens(34));
     }
}




