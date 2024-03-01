package es.uah.matcomp.mp.e2.S04.EjLab7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @Test
    void getBegin() {
        MyLine nuevalinea1 = new MyLine(2,3,5,8);
        MyPoint begin = new MyPoint(2,3);
        assertEquals(begin.getX(), nuevalinea1.getBegin().getX());
        assertEquals(begin.getY(), nuevalinea1.getBegin().getY());
    }

    @Test
    void setBegin() {
        MyLine nuevalinea1 = new MyLine(2,3,5,8);
        MyPoint begin = new MyPoint(4,4);
        nuevalinea1.setBegin(begin);
        MyLine linea2 = new MyLine(4,4,5,8);
        assertEquals((MyPoint)linea2.getBegin(),(MyPoint)nuevalinea1.getBegin());
    }

    @Test
    void getEnd() {
    }

    @Test
    void setEnd() {
    }

    @Test
    void getBeginX() {
    }

    @Test
    void getBeginY() {
    }

    @Test
    void setBeginX() {
    }

    @Test
    void setBeginY() {
    }

    @Test
    void getEndX() {
    }

    @Test
    void getEndY() {
    }

    @Test
    void setEndX() {
    }

    @Test
    void setEndY() {
    }

    @Test
    void getBeginXY() {
    }

    @Test
    void getEndXY() {
    }

    @Test
    void setBeginXY() {
    }

    @Test
    void setEndXY() {
    }

    @Test
    void getLength() {
    }

    @Test
    void getGradient() {
    }

    @Test
    void testToString() {
    }
}