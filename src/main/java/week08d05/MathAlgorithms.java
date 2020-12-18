package week08d05;

public class MathAlgorithms {

    public int greatestCommonDivisor(int a, int b) {
        int rest = 0;
        int largerNumber;
        int smallerNumber;
        if (a > b){
            largerNumber = a;
            smallerNumber = b;
        }
        else {
            largerNumber = b;
            smallerNumber = a;
        }
        while (largerNumber % smallerNumber != 0) {
            rest = largerNumber % smallerNumber;
            int div = largerNumber / smallerNumber;
            largerNumber = smallerNumber;
            smallerNumber = div;
        }
        return rest;
    }
}
