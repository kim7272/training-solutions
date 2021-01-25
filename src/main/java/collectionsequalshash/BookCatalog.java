package collectionsequalshash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookCatalog {

    private Book[] books;


    public Book findBookByTitleAuthor(List<Book> books, String title, String author){
        for (Book book : books){
            if (book.getAuthor().equals(author) && book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }

    public Book findBook(List<Book> books, Book book){
        for (Book bookInList : books){
            if (bookInList.equals(book)){
                return bookInList;
            }
        }
        return null;
    }

    public Set<Book> addBooksToSet(Book[] books){
        Set<Book> s = new HashSet<Book>();
        for (Book book : books){
               s.add(book);
        }
        return s;
    }
}
