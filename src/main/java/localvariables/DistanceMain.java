package localvariables;

import java.util.Scanner;

public class DistanceMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the distance!");
        double distancelnKm = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Is it an exact value? Answer with true or false!");
        boolean exact = scanner.nextBoolean();

        Distance distance = new Distance(distancelnKm, exact);

        System.out.println(distance.getDistancelnKm()+" " + distance.isExact());

         int rounded;
         rounded = (int) distance.getDistancelnKm();
        System.out.println(rounded);

    }
}
