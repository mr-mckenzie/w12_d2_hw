import com.codeclan.example.Book;
import com.codeclan.example.Library;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library tinyLibrary;
    private Book theDictionary;
    private Book theThesaurus;
    private Book aTaleOfTwoCities;

    @Before
    public void beforeEach() {
        tinyLibrary = new Library(2);
        theDictionary = new Book("The Dictionary", "Chambers", "reference");
        theThesaurus = new Book("The Thesaurus", "Oxford", "Reference");
        aTaleOfTwoCities = new Book("A Tale of Two Cities", "Dickens", "Fiction");
    }

    @Test
    public void catalogueStartsEmpty() {
        assertEquals(0, tinyLibrary.getBookCount());
    }

    @Test
    public void canAddBook() {
        tinyLibrary.addBook(theDictionary);
        tinyLibrary.addBook(theThesaurus);
        assertEquals(2, tinyLibrary.getBookCount());
    }

    @Test
    public void cannotAddMoreBooksThanCapacity() {
        tinyLibrary.addBook(aTaleOfTwoCities);
        tinyLibrary.addBook(theDictionary);
        tinyLibrary.addBook(theThesaurus);
        assertEquals(2, tinyLibrary.getBookCount());
    }

    @Test
    public void canRemoveBookFromLibrary() {
        tinyLibrary.addBook(theThesaurus);
        tinyLibrary.removeBook("The Thesaurus");
        assertEquals(0, tinyLibrary.getBookCount());
    }

    @Test
    public void cannotRemoveBookFromLibraryIfBookNotInCatalogue() {
        tinyLibrary.addBook(aTaleOfTwoCities);
        tinyLibrary.addBook(theDictionary);
        tinyLibrary.removeBook("Thesaurus");
        assertEquals(2, tinyLibrary.getBookCount());
    }

    @Test
    public void removeBookFunctionReturnsABook() {
        tinyLibrary.addBook(aTaleOfTwoCities);
        Book returnedBook = tinyLibrary.removeBook("A Tale of Two Cities");
        assertEquals("A Tale of Two Cities", returnedBook.getTitle());
    }



}
