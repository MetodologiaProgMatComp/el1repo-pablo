package es.uah.matcomp.mp.e1.ejerciciosclases.EjerLaboratorio2;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @org.junit.jupiter.api.Test
    void crearCirculo1() {
        Circulo c1 = new Circulo();
    }

    @org.junit.jupiter.api.Test
    void crearCirculo2() {
    }

    @org.junit.jupiter.api.Test
    void getRadius() {
        Circulo c1 = new Circulo(5);
        assertEquals(5, c1.getRadius());
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        Circulo c1 = new Circulo(5);
        c1.setRadius(3);
        assertEquals(3, c1.getRadius());
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        Circulo c1 = new Circulo(5);
        assertEquals(25*Math.PI,c1.getArea());
    }

    @org.junit.jupiter.api.Test
    void getCircumference() {
        Circulo c1 = new Circulo(5);
        double circumference = 2*5*Math.PI;
        assertEquals(circumference, c1.getCircumference());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Circulo c1 = new Circulo(5);
        assertEquals("Circle[radius= 5.0]", c1.toString());
    }
}