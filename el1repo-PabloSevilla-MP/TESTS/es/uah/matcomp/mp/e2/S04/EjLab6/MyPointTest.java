package es.uah.matcomp.mp.e2.S04.EjLab6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void getX() {
        MyPoint punto=new MyPoint(4,3);
        assertEquals(4,punto.getX());
    }

    @Test
    void setX() {
        MyPoint punto = new MyPoint();
        punto.setX(3);
        assertEquals(3, punto.getX());
    }

    @Test
    void getY() {
        MyPoint punto=new MyPoint(4,3);
        assertEquals(3,punto.getY());
    }

    @Test
    void setY() {
        MyPoint punto = new MyPoint();
        punto.setY(7);
        assertEquals(7, punto.getY());
    }

    @Test
    void getXY() {
        MyPoint punto = new MyPoint(1,2);
    }

    @Test
    void setXY() {
        MyPoint punto = new MyPoint(1,2);
        punto.setX(2);
        punto.setY(3);
        assertEquals(2,punto.getX());
        assertEquals(3,punto.getY());
    }

    @Test
    void testToString() {
        String coord= "(1,2)";
        MyPoint punto = new MyPoint(1,2);
        assertEquals(coord,punto.toString());
    }

    @Test
    void distance() {
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println(p1.distance(5, 6));
    }

    @Test
    void testDistance() {
        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(5, 6);
        System.out.println(p1.distance(p2));
    }

    @Test
    void testDistance1() {
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println(p1.distance());
    }
}