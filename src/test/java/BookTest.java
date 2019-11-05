import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("Trainspotting", "Irvine Welsh", "Dark Comedy");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("Trainspotting", book.hasTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Irvine Welsh", book.hasAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Dark Comedy", book.hasGenre());
    }

}
