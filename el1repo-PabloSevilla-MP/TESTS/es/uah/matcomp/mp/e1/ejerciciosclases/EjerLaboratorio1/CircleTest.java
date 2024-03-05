package es.uah.matcomp.mp.e1.ejerciciosclases.EjerLaboratorio1;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @org.junit.jupiter.api.Test
    void getRadius() {
        Circle c1 = new Circle(3);
        double result = c1.getRadius();
        assertEquals(3, result);
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        Circle c1 = new Circle(3,"green");
        assertEquals("green", c1.getColor());

    }

    @org.junit.jupiter.api.Test
    void getArea() {
        Circle c1 = new Circle(3);
        assertEquals(Math.PI*3*3, c1.getArea());
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        Circle c1 = new Circle(3);
        c1.setRadius(2);
        assertEquals(2,c1.getRadius());

    }

    @org.junit.jupiter.api.Test
    void setColor() {
        Circle c1 = new Circle(3, "red");
        c1.setColor("green");
        assertEquals("green",c1.getColor());

    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Circle c1 = new Circle(3);
    }
}