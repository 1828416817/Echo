package Design.BMS;

public class Book {
    public int id;
    public String BookName;
    public String author;
    public double  price;
    public Book next;

    public Book(int id, String bookName, String author, double price) {
        this.id = id;
        BookName = bookName;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", BookName='" + BookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
