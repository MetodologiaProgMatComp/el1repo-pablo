package es.uah.matcomp.mp.e4.S06.Polimorfismos.EjLab1;

public class Circle extends Shape{
    protected double radius = 1.0;
    public Circle(){}

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }
    public String toString(){
        return "Circle["+super.toString()+", radius= "+radius+"]";
    }
}
