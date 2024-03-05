package es.uah.matcomp.mp.e1.ejerciciosclases.EjerLaboratorio7;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @org.junit.jupiter.api.Test
    void getDay() {
        Date nuevo = new Date(22, 9, 2005);
        assertEquals(22, nuevo.getDay());
    }

    @org.junit.jupiter.api.Test
    void setDay() {
        Date nuevo = new Date(22, 9, 2005);
        nuevo.setDay(5);
        assertEquals(5,nuevo.getDay());
    }

    @org.junit.jupiter.api.Test
    void getMonth() {
        Date nuevo = new Date(22, 9, 2005);
        assertEquals(9, nuevo.getMonth());
    }

    @org.junit.jupiter.api.Test
    void setMonth() {
        Date nuevo = new Date(22, 9, 2005);
        nuevo.setMonth(4);
        assertEquals(4, nuevo.getMonth());
    }

    @org.junit.jupiter.api.Test
    void getYear() {
        Date nuevo = new Date(22, 9, 2005);
        assertEquals(2005, nuevo.getYear());
    }

    @org.junit.jupiter.api.Test
    void setYear() {
        Date nuevo = new Date(22, 9, 2005);
        nuevo.setYear(2003);
        assertEquals(2003, nuevo.getYear());
    }

    @org.junit.jupiter.api.Test
    void setDate() {
        Date nuevo = new Date(22, 9, 2005);
        nuevo.setDate(11,3,2006);
        assertEquals(11, nuevo.getDay());
        assertEquals(3, nuevo.getMonth());
        assertEquals(2006, nuevo.getYear());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}