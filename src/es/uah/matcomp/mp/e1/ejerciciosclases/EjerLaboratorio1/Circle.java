package es.uah.matcomp.mp.e1.ejerciciosclases.EjerLaboratorio1;
import java.lang.String;
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
        this.radius = r;

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
    public void setRadius(double newRadius) {
        this.radius=newRadius;
    }

    public String setColor(String newColor) {
        color = newColor;
        return color;
    }
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
