package genericsusage.withgenerics;

import genericsusage.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> bookList = new ArrayList<>();

    public Book getFirstBook(List<Book> bookList){
        if (bookList == null){
            throw new NullPointerException();
        }
        else if (bookList.isEmpty()){
            throw new IllegalArgumentException("Argument should not be empty!");
        }
        return bookList.get(0);

    }
}
