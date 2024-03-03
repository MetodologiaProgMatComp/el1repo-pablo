package es.uah.matcomp.mp.e3.S05.Herencia.EjLab6;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);
        Point p1 = new Point(2,2);
        Point p2 = new Point(6,1);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);
        System.out.println(l2.getBeginX());
        System.out.println(l2.getBeginY());
        System.out.println(l2.getBegin());
        System.out.println(l2.getEndX());
        System.out.println(l2.getEndY());
        System.out.println(l2.getEnd());
        Point punto = new Point(1,1);
        l1.setBegin(punto);
        l1.setEnd(punto);
        l2.setBeginX(1);
        l2.setBeginY(3);
        l2.setEndX(-2);
        l2.setEndY(0);
        System.out.println(l1);
        System.out.println(l2);
        l1.setBeginXY(2,2);
        l1.setEndXY(3,3);
        System.out.println(l1);
        System.out.println(l2.getLength());
        System.out.println(l2.getGradient());
    }
}
