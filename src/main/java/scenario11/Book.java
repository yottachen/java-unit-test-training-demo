package scenario11;

public class Book {
    private String name;
    private String authorName;
    private int price;
    private String press;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getPress() {
        return press;
    }
}
