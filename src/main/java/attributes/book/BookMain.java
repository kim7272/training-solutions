package attributes.book;

public class BookMain {


    public static void main(String[] args) {

        Book book = new Book("Pride and Prejudice");
        System.out.println(book.getTitle());

        book.setTitle("The Big Murdoch");
        System.out.println(book.getTitle());
    }
}
