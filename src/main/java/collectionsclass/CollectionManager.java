package collectionsclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionManager {

    private List<Book> library = new ArrayList<>();

    public CollectionManager(List<Book> library) {
        this.library = library;
    }

    public List<Book> createUnmodifiableLibrary(){
        List<Book> unmodifiable = Collections.unmodifiableList(library);
        return unmodifiable;
    }

    public List<Book> reverseLibrary() {
        List<Book> reversed = new ArrayList<>(library);
        Collections.reverse(reversed);
        return reversed;
    }

    public Book getFirstBook() {
        Book oldest = null;
        Collections.sort(library);
        return library.get(0);
    }

    public Book getLastBook() {
        Book newest = null;
        Collections.sort(library);
        return library.get(library.size()-1);
    }
}
