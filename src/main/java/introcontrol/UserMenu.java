package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználók felvétele");

        System.out.println("Adjon meg egy számot!");
        int i = scanner.nextInt();

        if (i == 1) {
            System.out.println("Felhasználók listázása");
        } else if (i== 2) {
            System.out.println("Felhasználók felvétele");
        } else {
            System.out.println("");
            }
        }
    }

