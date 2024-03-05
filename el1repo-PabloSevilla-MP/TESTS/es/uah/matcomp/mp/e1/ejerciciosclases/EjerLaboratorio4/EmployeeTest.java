package es.uah.matcomp.mp.e1.ejerciciosclases.EjerLaboratorio4;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @org.junit.jupiter.api.Test
    void getId() {
        Employee user = new Employee(11, "Pablo", "Sevilla", 3000);
        assertEquals(11, user.getId());
    }

    @org.junit.jupiter.api.Test
    void getFirstName() {
        Employee user = new Employee(11, "Pablo", "Sevilla", 3000);
        assertEquals("Pablo", user.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        Employee user = new Employee(11, "Pablo", "Sevilla", 3000);
        assertEquals("Sevilla", user.getLastName());
    }

    @org.junit.jupiter.api.Test
    void getSalary() {
        Employee user = new Employee(11, "Pablo", "Sevilla", 3000);
        assertEquals(3000, user.getSalary());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Employee user = new Employee(11, "Pablo", "Sevilla", 3000);
        assertEquals("Pablo Sevilla", user.getName());
    }

    @org.junit.jupiter.api.Test
    void setSalary() {
        Employee user = new Employee(11, "Pablo", "Sevilla", 3000);
        user.setSalary(5000);
        assertEquals(5000, user.getSalary());
    }

    @org.junit.jupiter.api.Test
    void getAnnualSalary() {
        Employee user = new Employee(11, "Pablo", "Sevilla", 3000);
        int annual = 3000 * 12;
        assertEquals(annual, user.getAnnualSalary());
    }

    @org.junit.jupiter.api.Test
    void raiseSalary() {
        Employee user = new Employee(11, "Pablo", "Sevilla", 3000);
        double newsalary = 3000*1.2;
        assertEquals(newsalary, user.raiseSalary(20));
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}