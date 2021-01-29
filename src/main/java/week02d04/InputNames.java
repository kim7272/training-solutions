package week02d04;

import java.util.Scanner;

public class InputNames {

    private String name;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Give me the name with index " + i);
            names[i] = scanner.nextLine();
        }
        for (int i = 0; i < 5; i++){
            System.out.println(names[i] + " is the " + i + ". element.");
        }
    }
}
