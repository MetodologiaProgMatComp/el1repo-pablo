package es.uah.matcomp.mp.e1.ejerciciosclases.EjerLaboratorio2;

public class Circulo {
    private double radius = 1.0;

    public Circulo(double r) {
        this.radius = r;
    }

    public Circulo() {
        this.radius = 2.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle[radius= " + this.radius + "]";
    }
}
