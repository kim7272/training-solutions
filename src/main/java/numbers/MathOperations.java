package numbers;

import java.util.Scanner;

public class MathOperations {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MathOperations mathOperations = new MathOperations();

        System.out.println("Megoldandó: ((2+3)*1,1-3)/3");

        double result = ((2 + 3) * 1.1 - 3) / 3.0;
        //System.out.println(result);

        double externCalculation =  scanner.nextDouble();
        scanner.nextLine();

            boolean b;

        if (Math.abs(externCalculation - result) < 0.0001){
            b = true;
            } else {
            b = false;
            }
        System.out.println(b);
        }
    }
