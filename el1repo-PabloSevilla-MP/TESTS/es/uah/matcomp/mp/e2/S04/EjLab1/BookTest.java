package es.uah.matcomp.mp.e2.S04.EjLab1;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        Book libro = new Book("Cuentacuentos", nuevo , 30);
        assertEquals("Cuentacuentos", libro.getName());
    }

    @org.junit.jupiter.api.Test
    void getAuthor() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        Book libro = new Book("Cuentacuentos", nuevo , 30, 5);
        assertEquals(nuevo, libro.getAuthor());
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        Book libro = new Book("Cuentacuentos", nuevo , 30, 5);
        assertEquals(30, libro.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getQty() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        Book libro = new Book("Cuentacuentos", nuevo , 30, 5);
        assertEquals(5, libro.getQty());
    }

    @org.junit.jupiter.api.Test
    void setPrice() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        Book libro = new Book("Cuentacuentos", nuevo , 30, 5);
        libro.setPrice(20);
        assertEquals(20, libro.getPrice());
    }

    @org.junit.jupiter.api.Test
    void setQty() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        Book libro = new Book("Cuentacuentos", nuevo , 30, 5);
        libro.setQty(10);
        assertEquals(10, libro.getQty());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @org.junit.jupiter.api.Test
    void getAuthorName() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        Book libro = new Book("Cuentacuentos", nuevo , 30, 5);
        assertEquals("Pablo", libro.getAuthorName());
    }

    @org.junit.jupiter.api.Test
    void getAuthorEmail() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        Book libro = new Book("Cuentacuentos", nuevo , 30, 5);
        assertEquals("pablo@gmail.com", libro.getAuthorEmail());
    }

    @org.junit.jupiter.api.Test
    void getAuthorGender() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        Book libro = new Book("Cuentacuentos", nuevo , 30, 5);
        assertEquals('m', libro.getAuthorGender());
    }
}