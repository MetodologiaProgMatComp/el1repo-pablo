package es.uah.matcomp.mp.e2.S04.EjLab2;

import es.uah.matcomp.mp.e2.S04.EjLab1.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookUpgradeTest {

    @Test
    void getName() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        Author nuevo2 = new Author("Raul", "rmy@gmail.com", 'm');
        Author[] authors = new Author[]{nuevo, nuevo2};
        BookUpgrade book = new BookUpgrade("Cuentacuentos", authors, 30, 5);
        assertEquals("Cuentacuentos" , book.getName());
    }

    @Test
    void getAuthors() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        Author nuevo2 = new Author("Raul", "rmy@gmail.com", 'm');
        Author[] authors = new Author[]{nuevo, nuevo2};
        BookUpgrade book = new BookUpgrade("Cuentacuentos", authors, 30, 5);
        assertEquals((String) authors.toString(), (String) book.getAuthors().toString());
    }

    @Test
    void getPrice() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        Author nuevo2 = new Author("Raul", "rmy@gmail.com", 'm');
        Author[] authors = new Author[]{nuevo, nuevo2};
        BookUpgrade book = new BookUpgrade("Cuentacuentos", authors, 30, 5);
        assertEquals(30, book.getPrice());
    }

    @Test
    void getQty() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        Author nuevo2 = new Author("Raul", "rmy@gmail.com", 'm');
        Author[] authors = new Author[]{nuevo, nuevo2};
        BookUpgrade book = new BookUpgrade("Cuentacuentos", authors, 30, 5);
        assertEquals(5, book.getQty());
    }

    @Test
    void setPrice() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        Author nuevo2 = new Author("Raul", "rmy@gmail.com", 'm');
        Author[] authors = new Author[]{nuevo, nuevo2};
        BookUpgrade book = new BookUpgrade("Cuentacuentos", authors, 30, 5);
        book.setPrice(25);
        assertEquals(25, book.getPrice());
    }

    @Test
    void setQty() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        Author nuevo2 = new Author("Raul", "rmy@gmail.com", 'm');
        Author[] authors = new Author[]{nuevo, nuevo2};
        BookUpgrade book = new BookUpgrade("Cuentacuentos", authors, 30, 5);
        book.setQty(10);
        assertEquals(10, book.getQty());
    }

    @Test
    void testToString() {
    }

    @Test
    void getAuthorNames() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        Author nuevo2 = new Author("Raul", "rmy@gmail.com", 'm');
        Author[] authors = new Author[]{nuevo, nuevo2};
        BookUpgrade book = new BookUpgrade("Cuentacuentos", authors, 30, 5);
        assertEquals("Pablo", book.getAuthorNames());
    }
}