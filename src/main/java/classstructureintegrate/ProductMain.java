package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the product?");
        String name = scanner.nextLine();
        System.out.println("Price of the product?");
        int price = scanner.nextInt();
        scanner.nextLine();

        Product product = new Product(name, price);
        System.out.println("The name of the product is: " + product.getName());
        System.out.println("The price of the product is: " + product.getPrice());

        System.out.println("How much was the increase of the price?");
        product.increasePrice(scanner.nextInt());
        scanner.nextLine();
        System.out.println("How much was the decrease of the price?");
        product.decreasePrice(scanner.nextInt());
        System.out.println("The new price of the " + product.getName() + " is: " + product.getPrice());


    }
}
