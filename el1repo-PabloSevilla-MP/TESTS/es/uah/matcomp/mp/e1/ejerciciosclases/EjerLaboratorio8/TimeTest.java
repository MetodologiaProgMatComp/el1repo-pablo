package es.uah.matcomp.mp.e1.ejerciciosclases.EjerLaboratorio8;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @org.junit.jupiter.api.Test
    void getHour() {
        Time nuevo = new Time(12,11,10);
        assertEquals(12 , nuevo.getHour());
    }

    @org.junit.jupiter.api.Test
    void setHour() {
        Time nuevo = new Time(12,11,10);
        nuevo.setHour(13);
        assertEquals(13, nuevo.getHour());
    }

    @org.junit.jupiter.api.Test
    void getMinute() {
        Time nuevo = new Time(12,11,10);
        assertEquals(11, nuevo.getMinute());
    }

    @org.junit.jupiter.api.Test
    void setMinute() {
        Time nuevo = new Time(12,11,10);
        nuevo.setMinute(20);
        assertEquals(20, nuevo.getMinute());
    }

    @org.junit.jupiter.api.Test
    void getSecond() {
        Time nuevo = new Time(12,11,10);
        assertEquals(10, nuevo.getSecond());
    }

    @org.junit.jupiter.api.Test
    void setSecond() {
        Time nuevo = new Time(12,11,10);
        nuevo.setSecond(30);
        assertEquals(30, nuevo.getSecond());
    }

    @org.junit.jupiter.api.Test
    void setTime() {
        Time nuevo = new Time(12,11,10);
        nuevo.setTime(20,21,22);
        assertEquals(20, nuevo.getHour());
        assertEquals(21, nuevo.getMinute());
        assertEquals(22, nuevo.getSecond());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @org.junit.jupiter.api.Test
    void nextSecond() {
        Time nuevo = new Time(23,59,59);
        Time nuevo2 = new Time(0,0,0);
        assertEquals((String)nuevo2.toString(), (String)nuevo.nextSecond().toString());
    }

    @org.junit.jupiter.api.Test
    void previousSecond() {
        Time nuevo = new Time(0,0,0);
        Time nuevo2 = new Time(23,59,59);
        assertEquals((String)nuevo2.toString(), (String)nuevo.previousSecond().toString());
    }
}