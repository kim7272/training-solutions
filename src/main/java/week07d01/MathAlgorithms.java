package week07d01;

public class MathAlgorithms {

    private static int x;

    public static boolean isPrime(int x) {
        if (x <= 0) {
            throw new IllegalArgumentException("x should be a positive integer!");
        }
        boolean b = true;
        for (int i = 2; i < x / 2; i++) {
            if (x % i == 0) {
                b = false;
            }
        }
        return b;
    }
}
