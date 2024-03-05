package es.uah.matcomp.mp.e1.ejerciciosclases.EjerLaboratorio6;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @org.junit.jupiter.api.Test
    void getId() {
        Account nuevo = new Account("10", "Cuenta1", 100);
        assertEquals("10",nuevo.getId());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Account nuevo = new Account("10", "Cuenta1",100);
        assertEquals("Cuenta1", nuevo.getName());
    }

    @org.junit.jupiter.api.Test
    void getBalance() {
        Account nuevo = new Account("10", "Cuenta1",100);
        assertEquals(100, nuevo.getBalance());
    }

    @org.junit.jupiter.api.Test
    void credit() {
        Account nuevo = new Account("10", "Cuenta1",100);
        assertEquals(120, nuevo.credit(20));
    }

    @org.junit.jupiter.api.Test
    void debit() {
        Account nuevo = new Account("10", "Cuenta1",100);
        assertEquals(80, nuevo.debit(20));
    }

    @org.junit.jupiter.api.Test
    void transferTo() {
        Account nuevo = new Account("10", "Cuenta1",100);
        Account nuevo2 = new Account("11", "Cuenta2",200);
        assertEquals(50, nuevo.transferTo(nuevo2,50));
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}