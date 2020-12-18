package week08d05;

public class MathAlgorithms {

    public int greatestCommonDivisor(int largerNumber, int smallerNumber) {
        int i = 1;
        int rest = 0;

        while (largerNumber % smallerNumber != 0) {
            rest = largerNumber % smallerNumber;
            int div = largerNumber / smallerNumber;
            largerNumber = smallerNumber;
            smallerNumber = div;
        }
        return rest;
    }
}
