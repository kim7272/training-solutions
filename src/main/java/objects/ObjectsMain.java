package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {

        new Book();
      //  System.out.println(Book);

        Book emptyBook = null;
        System.out.println(emptyBook);

        System.out.println((emptyBook == null)) ;

        Book book = new Book();
        System.out.println(book);

        book = null;
        System.out.println(book);

        book = new Book();
        System.out.println(book);

        Book anotherBook = new Book();
        System.out.println(book == anotherBook);

        System.out.println(anotherBook instanceof Book);


        Book[] books = {new Book(), new Book(), new Book()};

        List<Book> bookList = Arrays.asList(new Book(), new Book(), new Book());

        List<Book> bookList2 = new ArrayList<>();
        bookList2.add(new Book());
        bookList2.add(new Book());
        bookList2.add(new Book());





    }

}
