package primer3;
import java.lang.*;

public class Book_test {
    public static void main(String[] args) {
        Book b1 = new Book("Алина", 245);
        Book b2 = new Book("Петр", 450);
        Book b3 = new Book("Михаил");
        b3.setPages(1);
        System.out.println(b1);
        b1.book();
        b2.book();
        b3.book();
    }
}

