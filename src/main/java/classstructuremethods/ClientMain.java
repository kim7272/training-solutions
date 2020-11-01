package classstructuremethods;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the name!");
        client.changeName((scanner.nextLine()));

        System.out.println("Give me the year of birth!");
        client.changeYear((scanner.nextInt()));
        scanner.nextLine();

        System.out.println("Give me the address!");
        client.changeAddress((scanner.nextLine()));

        System.out.println(client.getName());
        System.out.println(client.getYear());
        System.out.println(client.getAddress());

        System.out.println("Give me the changed address!");
        client.migrate(scanner.nextLine());

       System.out.println(client.getAddress());

    }
}
