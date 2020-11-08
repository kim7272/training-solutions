package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Adja meg a(z) "+ i +". számot!");
            int result = scanner.nextInt();
            scanner.nextLine();
            sum = sum + result;
            }
        System.out.println("Az öt szám összege: "+ sum);
    }
}
