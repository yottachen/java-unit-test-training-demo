package scenario11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookStore {
    private List<Book> books;

    private List<Pen> pens;

    public BookStore() {
        this.books = new ArrayList<>();
        this.pens = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addPen(Pen pen) {
        pens.add(pen);
    }


    public String getBookNames() {
        String out = "";
        for (Book book : books) {
            out += book.getName() + " " + book.getAuthorName() + " " + book.getPress() + " " + book.getPrice();
        }

        return out;
    }

    public String getPenInfo() {
        String out = "";
        for (Pen pen: pens) {
            out += pen.getBrand() + " " + pen.getColor() + " " + pen.getPrice() + " " + Arrays.toString(pen.getOccupations().toArray());
        }

        return out;
    }

}
