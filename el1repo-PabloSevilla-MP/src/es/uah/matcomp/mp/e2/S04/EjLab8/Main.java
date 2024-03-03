package es.uah.matcomp.mp.e2.S04.EjLab8;

import es.uah.matcomp.mp.e2.S04.EjLab7.MyPoint;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle(2,2,2);
        es.uah.matcomp.mp.e2.S04.EjLab7.MyPoint centro = new MyPoint();
        MyCircle c3 = new MyCircle(centro,1);
        MyPoint nuevocentro = new MyPoint(5,5);
        c3.setCenter(nuevocentro);
        System.out.println(c3.getRadius());
        c1.setRadius(3);
        System.out.println(c3.getCenterX());
        System.out.println(c3.getCenterY());
        System.out.println("");
        c2.setCenterX(3);
        c2.setCenterY(3);
        System.out.println(c2);
        System.out.println("");
        c1.setCenterXY(9,9);
        System.out.println(Arrays.toString(c1.getCenterXY()));
        System.out.println("");
        System.out.println(c2.getArea());
        System.out.println(c3.getCircumference());
        System.out.println(c2.distance(c1));
    }
}
