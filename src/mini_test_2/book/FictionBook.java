package mini_test_2.book;

public class FictionBook extends Book {
    private String category;

    public FictionBook() {}

    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(String bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "{" +
                "bookCode='" + super.getBookCode() +'\'' +
                ", name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", author='" + super.getAuthor() + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
