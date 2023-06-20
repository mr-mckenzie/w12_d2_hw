import com.codeclan.example.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book warAndPeace;

    @Before
    public void beforeEach(){
        warAndPeace = new Book("War and Peace", "Tolstoy", "Fiction");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("War and Peace", warAndPeace.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Tolstoy", warAndPeace.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Fiction", warAndPeace.getGenre());
    }


}
