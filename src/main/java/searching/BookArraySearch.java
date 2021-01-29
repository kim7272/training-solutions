package searching;

import java.util.Arrays;

public class BookArraySearch {

    private Book[] bookArray;

    public BookArraySearch(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public boolean isInvalid(String str) {

        return str == null || str.isEmpty();
    }


    public Book findBookByAuthorTitle(String author, String title) {


        if (isInvalid(author) || isInvalid(title)){
            throw new IllegalArgumentException("Author or title must not be empty!");
        }

        Book toFind = new Book(author, title);
        Arrays.sort(bookArray);
        int index =  Arrays.binarySearch(bookArray, toFind);
        if (index < 0){
            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
        }
        return bookArray[index];
    }
}
