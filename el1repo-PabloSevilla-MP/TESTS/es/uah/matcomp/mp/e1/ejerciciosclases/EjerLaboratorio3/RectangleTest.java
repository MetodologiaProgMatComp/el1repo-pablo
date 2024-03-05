package es.uah.matcomp.mp.e1.ejerciciosclases.EjerLaboratorio3;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @org.junit.jupiter.api.Test
    void getLength() {
        Rectangle r1 = new Rectangle(3.0f,5.0f);
        assertEquals(3.0f, r1.getLength());
    }

    @org.junit.jupiter.api.Test
    void setLength() {
        Rectangle r1 = new Rectangle();
        r1.setLength(2.0f);
        assertEquals(2.0f, r1.getLength());
    }

    @org.junit.jupiter.api.Test
    void getWidth() {
        Rectangle r1 = new Rectangle(3.0f,5.0f);
        assertEquals(5.0f, r1.getWidth());
    }

    @org.junit.jupiter.api.Test
    void setWidth() {
        Rectangle r1 = new Rectangle(3.0f,5.0f);
        r1.setWidth(7.0f);
        assertEquals(7.0f,r1.getWidth());
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        Rectangle r1 = new Rectangle(3.0f,5.0f);
        float area= 3.0f * 5.0f;
        assertEquals(area, r1.getArea());
    }

    @org.junit.jupiter.api.Test
    void getPerimeter() {
        Rectangle r1 = new Rectangle(3.0f,5.0f);
        float perimeter = 2*3.0f + 2*5.0f;
        assertEquals(perimeter, r1.getPerimeter());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}