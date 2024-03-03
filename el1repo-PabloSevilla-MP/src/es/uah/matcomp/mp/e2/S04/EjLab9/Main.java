package es.uah.matcomp.mp.e2.S04.EjLab9;
import es.uah.matcomp.mp.e2.S04.EjLab7.MyPoint;

public class Main {
    public static void main(String[] args){
        MyTriangle t1= new MyTriangle(1,3,0,0,4,6);
        MyPoint ver1= new MyPoint(1,1);
        MyPoint ver2= new MyPoint(0,2);
        MyPoint ver3= new MyPoint(0,0);
        MyTriangle t2 = new MyTriangle(ver1,ver2,ver3);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1.getPerimeter());
        System.out.println(t2.getType());
    }
}
