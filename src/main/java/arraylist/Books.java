package arraylist;
import org.w3c.dom.ls.LSOutput;
import java.util.ArrayList;
import java.util.List;

public class Books {
    List<String> titles = new ArrayList<>();

    public List<String> findAllByPrefix(String prefix) {
        List<String> foundTitles = new ArrayList<>();
        for (int i = 0; i < titles.size(); i++) {
            if (titles.get(i).startsWith(prefix))
                foundTitles.add(titles.get(i));
        }
        return foundTitles;
    }

    public List<String> getTitles() {
        return titles;
    }

    public void add(String title) {
        titles.add(title);
    }

    public static void main(String[] args) {

        Books books = new Books();
        books.add("The Hunger Games");
        books.add("Pride and Prejudice");
        books.add("Animal Farm");
        books.add("The Chronicles of Narnia");
        books.add("The Book Thief");
        System.out.println(books.getTitles());

         List<String> prefixList = new ArrayList<>();
         prefixList = books.findAllByPrefix("The");
         String prefixString = prefixList.toString();
         System.out.println(prefixString);
    }
}





