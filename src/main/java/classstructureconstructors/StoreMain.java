package classstructureconstructors;

import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the product in storage 1?");
        Store store1 = new Store(scanner.nextLine());

        System.out.println("What is the product in storage 2?");
        Store store2 = new Store(scanner.nextLine());

        System.out.println("The number of products in store 1 is: " + store1.getStock());
        System.out.println("The number of products in store 2 is: " + store2.getStock());

        System.out.println("Give me the quantity of the products newly delivered to storage 1!");
        store1.store(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Give me the quantity of the products newly delivered to storage 2!");
        store2.store(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Give me the quantity of the  products taken from storage 1!");
        store1.dispatch(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Give me the quantity of the products taken from storage 2!");
        store2.dispatch(scanner.nextInt());

        System.out.println("The number of products in store 1 is: " + store1.getStock());
        System.out.println("The number of products in store 2 is: " + store2.getStock());
    }
}
