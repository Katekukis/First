package primer3;
import java.lang.*;

public class Book {
    private String author;
    private int pages;

    public Book(String n, int a){
            author = n;
            pages = a;
        }
        public Book(String n){
            author = n;
            pages = 0;
        }
        public Book(){
            author = "Pup";
            pages = 0;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAuthor(String author){
            return author;
        }

        public int getPages() {
            return pages;
        }

        public String toString(){
            return this.author+", страниц "+this.pages;
        }

        public void book(){
            System.out.println(author+" автор книги ");
        }
    }


