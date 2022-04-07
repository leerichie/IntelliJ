package GroupOne.Week02;

public class Book {

    String author;
    String title;
    double price;

    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }
    public Book(String author, String title, double price){
        this(author, title);
        this.price = price;

    }
    public Book(){}

}

