package classstructureconstructors;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the name of the author!");
        String author = scanner.nextLine();
        System.out.println("Give me the title of the book!");
        String title = scanner.nextLine();

        Book book = new Book(author, title);

        System.out.println("Give me the registration number!");
        book.register(scanner.nextLine());

        System.out.println(book.getAuthor()+"," + " " + book.getTitle()+"," + " " + book.getRegNumber());

    }

}

