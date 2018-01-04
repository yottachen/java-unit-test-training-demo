package scenario11;

public class BookBuilder {
    private String name = "BookName";
    private String authorName = "Yingying";
    private String press = "English public press";
    private int price = 100;

    public static BookBuilder create() {
        return new BookBuilder();
    }

    public BookBuilder name(String name) {
        this.name = name;
        return this;
    }

    public BookBuilder authorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    public BookBuilder press(String press) {
        this.press = press;
        return this;
    }

    public BookBuilder price(int price) {
        this.price = price;
        return this;
    }

    public Book build() {
        Book book = new Book(name);
        book.setAuthorName(authorName);
        book.setPress(press);
        book.setPrice(price);
        return book;
    }
}
