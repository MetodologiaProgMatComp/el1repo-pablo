package es.uah.matcomp.mp.e1.ejerciciosclases.EjerLaboratorio2;

public class main {
    public static void main(String[] args) {
        // Test Constructors and toString()
        Circulo c1 = new Circulo(1.6);
        System.out.println(c1); // toString()
        Circulo c2 = new Circulo(); // default constructor
        System.out.println(c2);
        // Test setter and getter
        c1.setRadius(2.2);
        System.out.println(c1); // toString()
        System.out.println("radius is: " + c1.getRadius());
        // Test getArea() and getCircumference()
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
}
