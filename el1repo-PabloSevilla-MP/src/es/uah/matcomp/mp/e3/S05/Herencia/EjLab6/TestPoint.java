package es.uah.matcomp.mp.e3.S05.Herencia.EjLab6;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20); // Construct a Point
        System.out.println(p1);
        p1.setXY(100, 10);
        System.out.println(p1);
    }
}
