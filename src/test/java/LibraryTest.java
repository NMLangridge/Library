import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book1;
    Book book2;

    @Before
    public void before() {
        library = new Library(2);
        book = new Book("Trainspotting", "Irvine Welsh", "Dark Comedy");
        book1 = new Book("American Psycho", "Bret Easton Ellis", "Dark Comedy");
        book2 = new Book("This Side of Paradise", "F. Scott Fitzgerald", "Classic");
    }

    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cantAddBook() {
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }

}
