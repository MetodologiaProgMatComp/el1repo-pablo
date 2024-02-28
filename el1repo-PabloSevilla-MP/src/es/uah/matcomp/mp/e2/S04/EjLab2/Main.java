package es.uah.matcomp.mp.e2.S04.EjLab2;

import es.uah.matcomp.mp.e2.S04.EjLab1.Author;

public class Main {
    public static void main(String [] args){
        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
// Declare and allocate a Book instance
        BookUpgrade javaDummy = new BookUpgrade("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy); // toString()
    }
}
