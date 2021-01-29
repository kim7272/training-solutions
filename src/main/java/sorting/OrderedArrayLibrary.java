package sorting;


import java.util.Arrays;
import java.util.Comparator;

public class OrderedArrayLibrary {

    private Book[] bookArray;
    private BookComparatorByTitle bookComparatorByTitle;

    public OrderedArrayLibrary(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book[] sortingById(){
      Arrays.sort(bookArray);
      return bookArray;
    }

    public Book[] sortingByTitle(){
        Arrays.sort(bookArray, new BookComparatorByTitle());
        return bookArray;
        }
    }

