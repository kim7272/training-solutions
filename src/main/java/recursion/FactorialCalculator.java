package recursion;

public class FactorialCalculator {

    public long number;

    public long getFactorial(int number) {
        long result = 0L;
        if (number > 1) {
            result = getFactorial(number - 1);
            return result * number;
        } else if (number == 1) {
            result = 1;
        }
        return result;
    }
}
