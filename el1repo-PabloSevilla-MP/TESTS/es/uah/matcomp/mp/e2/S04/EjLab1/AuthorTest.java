package es.uah.matcomp.mp.e2.S04.EjLab1;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        assertEquals("Pablo", nuevo.getName());
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        assertEquals("pablo@gmail.com", nuevo.getEmail());
    }

    @org.junit.jupiter.api.Test
    void getGender() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        assertEquals('m', nuevo.getGender());
    }

    @org.junit.jupiter.api.Test
    void setEmail() {
        Author nuevo = new Author("Pablo", "pablo@gmail.com", 'm');
        nuevo.setEmail("psevilla@gmail.com");
        assertEquals("psevilla@gmail.com", nuevo.getEmail());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}