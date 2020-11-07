package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        System.out.println("Give me a number!");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        boolean b = (a % 3 == 0);
        if (b == true) {
            System.out.println(a + " osztható hárommal");
    }
        else {
            System.out.println(a + " nem osztható hárommal");

        }
    }

}
