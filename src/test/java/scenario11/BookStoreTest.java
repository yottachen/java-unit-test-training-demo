package scenario11;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Unit tests for the {@link BookStore} class. This shows how to create data object for tests by using builder
 */
public class BookStoreTest {

    private BookStore bookStore = new BookStore();

    @Test
    public void shouldReturnAllBooksNamesByMultipleSetMethods() throws Exception {
        Book book = new Book("Clean Code");
        book.setAuthorName("Yingying");
        book.setPress("IT publish press");
        book.setPrice(12);

        bookStore.addBook(book);
        assertEquals("Clean Code Yingying IT publish press 12", bookStore.getBookNames());
    }

    @Test
    public void shouldReturnAllBooksNamesByBuilder() throws Exception {
        Book book = BookBuilder.create().name("Clean Code").authorName("Yingying").press("IT publish press").price(12).build();

        bookStore.addBook(book);
        assertEquals("Clean Code Yingying IT publish press 12", bookStore.getBookNames());
    }
}