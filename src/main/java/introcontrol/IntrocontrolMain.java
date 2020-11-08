package introcontrol;

import java.util.Scanner;

public class IntrocontrolMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IntroControl introControl = new IntroControl();

        //System.out.println("Adjon meg egy egész számot!");
        //System.out.println("Adjon meg egy nevet!");
        //System.out.println("Havi eladás összege?");
        //System.out.println("Előző mérőóra pozíció?");
        //System.out.println("Következő mérőóra pozíció?");
        //int number = scanner.nextInt();
        //scanner.nextLine();
        //String name = scanner.nextLine();
        //int sale = scanner.nextInt();
        //scanner.nextLine();
        //int prev = scanner.nextInt();
        //scanner.nextLine();
        //int next = scanner.nextInt();

        //System.out.println(introControl.substractTenIfGreaterThanTen(number));
        //System.out.println(introControl.describeNumber(number));
        //System.out.println(introControl.greetingToJoe(name));
        //System.out.println(introControl.calculateBonus(sale));
        //System.out.println(introControl.calculateConsumption(prev, next));

        //System.out.println("Adjon meg egy pozitív egész számot!");
        //int max = scanner.nextInt();
        //introControl.printNumbers(max);

       // System.out.println("Adjon meg egy pozitív egész számot!");
        //int min = scanner.nextInt();
        //System.out.println("Adjon meg még egy pozitív egész számot!");
        //int max = scanner.nextInt();
        //introControl.printNumbersBetween(min, max);

       // System.out.println("Adjon meg egy pozitív egész számot!");
       // int a = scanner.nextInt();
      //  System.out.println("Adjon meg még egy pozitív egész számot!");
       // int b = scanner.nextInt();
      //  introControl.printNumbersBetweenAnyDirection(a, b);

        System.out.println("Adjon meg egy pozitív egész számot!");
        int max = scanner.nextInt();
        introControl.printOddNumbers(max);




    }
}

