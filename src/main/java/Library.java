import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return books.size();
    }

    public void addBook(Book book) {
        if (bookCount() < this.capacity) {
            this.books.add(book);
        }
    }

}
