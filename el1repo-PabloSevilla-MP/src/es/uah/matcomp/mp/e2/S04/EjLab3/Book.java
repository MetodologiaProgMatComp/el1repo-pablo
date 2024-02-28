package es.uah.matcomp.mp.e2.S04.EjLab3;

public class Book {
    String isbn;
    String name;
    Author author;
    double price;
    int qty=0;

    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getAuthorName(){
        return author.getName();
    }
    public String toString(){
        return "Book [ ISBN= "+isbn+", Name= "+name+", "+author+", Price= "+price+", Quantity= "+qty+"]";
    }
}
