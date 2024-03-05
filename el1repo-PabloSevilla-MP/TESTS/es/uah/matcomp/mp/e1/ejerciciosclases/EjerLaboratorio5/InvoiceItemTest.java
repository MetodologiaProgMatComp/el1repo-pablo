package es.uah.matcomp.mp.e1.ejerciciosclases.EjerLaboratorio5;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @org.junit.jupiter.api.Test
    void getId() {
        InvoiceItem nuevo = new InvoiceItem("Yogur3", "Yogures de fresa", 2, 2);
        assertEquals("Yogur3", nuevo.getId());
    }

    @org.junit.jupiter.api.Test
    void getDesc() {
        InvoiceItem nuevo = new InvoiceItem("Yogur3", "Yogures de fresa", 2, 2);
        assertEquals("Yogures de fresa", nuevo.getDesc());
    }

    @org.junit.jupiter.api.Test
    void getQty() {
        InvoiceItem nuevo = new InvoiceItem("Yogur3", "Yogures de fresa", 2, 2);
        assertEquals(2,nuevo.getQty());
    }

    @org.junit.jupiter.api.Test
    void getUnitPrice() {
        InvoiceItem nuevo = new InvoiceItem("Yogur3", "Yogures de fresa", 2, 2);
        assertEquals(2, nuevo.getUnitPrice());
    }

    @org.junit.jupiter.api.Test
    void setQty() {
        InvoiceItem nuevo = new InvoiceItem("Yogur3", "Yogures de fresa", 2, 2);
        nuevo.setQty(5);
        assertEquals(5, nuevo.getQty());
    }

    @org.junit.jupiter.api.Test
    void setUnitPrice() {
        InvoiceItem nuevo = new InvoiceItem("Yogur3", "Yogures de fresa", 2, 2);
        nuevo.setUnitPrice(10);
        assertEquals(10, nuevo.getUnitPrice());
    }

    @org.junit.jupiter.api.Test
    void getTotal() {
        InvoiceItem nuevo = new InvoiceItem("Yogur3", "Yogures de fresa", 2, 2);
        assertEquals(2*2, nuevo.getTotal());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}