package classstructureattributes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Year of birth?");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Your address?");
        String address = scanner.nextLine();

        Client client = new Client(name, yearOfBirth, address);

        System.out.println(client.name);
        System.out.println(client.year);
        System.out.println(client.address);
    }
}
