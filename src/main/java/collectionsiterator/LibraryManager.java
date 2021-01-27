package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class LibraryManager {

    private Set<Book> libraryBooks = new HashSet<>();

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }


    public Book findBookByRegNumber(int regNumber) {
        Book foundbook;
        Iterator<Book> it = libraryBooks.iterator();

        while (it.hasNext()) {
            foundbook = it.next();
            if (foundbook.getRegNumber() == regNumber) {
               return foundbook;
            }
        }
            throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public int removeBookByRegNumber(int regNumber) {
        Book foundbook;
        Iterator<Book> it = libraryBooks.iterator();

        while (it.hasNext()) {
            foundbook = it.next();
            if (foundbook.getRegNumber() == regNumber) {
                libraryBooks.remove(foundbook);
                return regNumber;
            }
        }
            throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public Set<Book> selectBooksByAuthor(String author) {
        Book foundbook;
        Set<Book> result = new HashSet<>();
        Set<Book> booksByAuthor = new HashSet<>();
        Iterator<Book> it = libraryBooks.iterator();

        while (it.hasNext()) {
            foundbook = it.next();
            if (foundbook.getAuthor().equals(author)) {
                booksByAuthor.add(foundbook);
            }
            result = booksByAuthor;
        }
        if (booksByAuthor.isEmpty()) {
            throw new MissingBookException("No books found by " + author);
        }
        return result;
    }


    public int libraryBooksCount() {
        int bookNumber = libraryBooks.size();
        return bookNumber;
    }
}
