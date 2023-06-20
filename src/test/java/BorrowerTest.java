import com.codeclan.example.Borrower;
import com.codeclan.example.Book;
import com.codeclan.example.Library;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower bookWorm;
    private Book thePhoneBook;
    private Library aTelephoneBox;

    @Before
    public void beforeEach() {
        bookWorm = new Borrower();
        thePhoneBook = new Book("The Phone Book", "BT", "Reference");
        aTelephoneBox = new Library(1);
        aTelephoneBox.addBook(thePhoneBook);
    }

    @Test
    public void shelfStartsAtZero() {
        assertEquals(0, bookWorm.getShelfTotal());
    }

    @Test
    public void canAddToShelf() {
        bookWorm.addToShelf(thePhoneBook);
        assertEquals(1, bookWorm.getShelf().size());
        assertEquals(thePhoneBook, bookWorm.getShelf().get(0));
    }

    @Test
    public void canCheckOutBookFromLibrary() {
        this.bookWorm.borrowBook("The Phone Book", aTelephoneBox);

    }


}
