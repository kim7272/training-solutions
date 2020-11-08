package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a vendégek létszámát!");
        int guests = scanner.nextInt();
        scanner.nextLine();

        if (guests <= 2) {
            System.out.println("A hármas számú csónak kölcsönözve, még van nyolc szabad férőhely.");
        } else if (guests > 2 & guests <= 5) {
            System.out.println("A hármas és a kettes számú csónakok kölcsönözve, még van öt szabad férőhely.");
        }
         else if (guests > 5 & guests <= 10){
            System.out.println("Mindhárom csónak kikölcsönözve, már nincs több szabad férőhely.");
        }
        else {
            System.out.println("Mindhárom csónak kikölcsönözve, már nincs több szabad férőhely, és " + (guests-10) + " vendég a parton maradt.");
        }
}
}


