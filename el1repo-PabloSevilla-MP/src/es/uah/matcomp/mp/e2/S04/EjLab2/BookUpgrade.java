package es.uah.matcomp.mp.e2.S04.EjLab2;

import es.uah.matcomp.mp.e2.S04.EjLab1.Author;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BookUpgrade {
    String name;
    Author[] authors;
    double price;
    int qty=0;

    public BookUpgrade(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public BookUpgrade(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
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
    public String toString(){
        return "Book [name= "+name+", "+ Arrays.toString(authors)+", price= "+price+", quantity="+qty+"]";
    }
    public String getAuthorNames(){
        int x=0;
        String fin= "";
        while (x< authors.length){
            String nombre=authors[x].getName();
            return nombre;
        }
        return fin;
    }
}
