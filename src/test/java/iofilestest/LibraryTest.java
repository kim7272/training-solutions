package iofilestest;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.rules.TemporaryFolder;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @TempDir
    File temporaryFolder;
    Path file = new File(temporaryFolder, "library.txt").toPath();


    @Test
    public void testSaveBooks() throws IOException {

        System.out.println(file);
        List<Book> books = new ArrayList<>();
        books.add(new Book("John Doe", "Alpha"));
        books.add(new Book("Jane Doe", "Beta"));
        books.add(new Book("Jack Doe", "Gamma"));

        Library library = new Library(books);
        library.saveBooks(file);

        List<Book> content = library.loadBooks(file);
        assertEquals(3, content.size());
        assertEquals("Book{author='Jane Doe', title=' Beta'}", content.get(1).toString());
    }
}


