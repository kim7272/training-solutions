package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the first number!");
        int firstNumber = scanner.nextInt();
        System.out.println("Give me the second number!");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;

        System.out.println(firstNumber + " + " + secondNumber);
        System.out.println(sum);
    }
}