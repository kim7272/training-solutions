package operators;

import java.util.Scanner;

public class OperatorsMain {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        Operators operators = new Operators();
        System.out.println("Give me a number!");
        n = scanner.nextInt();
        System.out.println(operators.isEven(n));

        System.out.println("Give me a number for basis number in power operations with 2!");
        int basis = scanner.nextInt();

        System.out.println("Give me a number for power of two in power operations with 2!");
        int powerOfTwo = scanner.nextInt();

        System.out.println(operators.mulitplyByPowerOfTwo(basis,powerOfTwo));
    }
}
