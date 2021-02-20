package collectionsclass;

import java.util.Objects;

public class Book implements  Comparable<Book> {

    private int id;
    private String author;
    private String title;

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public String toString() {
        return id + " " + author + " " + title;
    }

    public Book(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    @Override
    public int compareTo(Book o) {
        if (this.id == o.id){
            return 0;
        }
        else if (this.id > o.id){
            return 1;
        }
        else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o){
        Book b = (Book) o;
        if (this.compareTo(b) == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
