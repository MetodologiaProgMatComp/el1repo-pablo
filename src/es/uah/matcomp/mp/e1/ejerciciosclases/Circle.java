package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Circle {
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }
    public Circle (double r, String c) {
        radius = r;
        color = c;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public void getRadius(double newRadius) {
        radius=newRadius;
    }

    public void setColor(String newColor) {
        color = newColor;
    }
}
