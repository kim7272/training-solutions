package iofilestest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> addBooks(Book book){
        if (!books.contains(book)){
            books.add(book);
        }
        return books;
    }

    public void saveBooks(Path path){
        try (BufferedWriter writer  = Files.newBufferedWriter(path)){
            for (Book book : books){
                writer.write(book.getAuthor() + ", " + book.getTitle() + "\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file!", e);
        }
    }

    public List<Book> loadBooks(Path path){
        List<Book> readBooks = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(path)){
            String line;
            while ((line = reader.readLine())  != null) {
                String[] parts = line.split(",");
                readBooks.add(new Book(parts[0], parts[1]));
            }
        } catch (IOException e) {
            throw new IllegalStateException(("Can not read file!"), e);
        }
        return readBooks;
    }

       public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book("John Doe", "Alpha"), new Book("Jane Doe", "Beta"),
                new Book ("Jack Doe", "Gamma"));
        Library library = new Library(books);
        library.saveBooks( Path.of("C:/training/training-solutions/src/main/resources/proba/books.txt"));
        List<Book> result = library.loadBooks(Path.of("C:/training/training-solutions/src/main/resources/proba/books.txt"));
           System.out.println(result);
    }
}
