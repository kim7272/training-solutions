package numbers;

import java.util.Scanner;

public class CircleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give diameter 1:");
        int diameter_1 = scanner.nextInt();
        scanner.nextLine();
        Circle circle_1 = new Circle(diameter_1);
        System.out.println("Az első kör kerülete:");
        System.out.println(circle_1.perimeter());
        System.out.println("Az első kör területe:");
        System.out.println(circle_1.area());


        System.out.println("Give diameter 2:");
        int diameter_2 = scanner.nextInt();
        scanner.nextLine();
        Circle circle_2 = new Circle(diameter_2);
        System.out.println("A második kör kerülete:");
        System.out.println(circle_2.perimeter());
        System.out.println("A második kör területe:");
        System.out.println(circle_2.area());





    }

}

