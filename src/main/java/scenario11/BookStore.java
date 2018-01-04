package scenario11;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> books;

    public BookStore() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public String getBookNames() {
        String out = "";
        for (Book book : books) {
            out += book.getName() + " " + book.getAuthorName() + " " + book.getPress() + " " + book.getPrice();
        }

        return out;

    }
}
