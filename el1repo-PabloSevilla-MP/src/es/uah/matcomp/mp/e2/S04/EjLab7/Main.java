package es.uah.matcomp.mp.e2.S04.EjLab7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        MyLine nuevalinea1 = new MyLine(2,3,5,8);
        MyPoint begin0 = new MyPoint(4,0);
        MyPoint end0 = new MyPoint(0,8);
        MyLine nuevalinea2 = new MyLine(begin0,end0);
        System.out.println(nuevalinea1.getBegin());
        System.out.println(nuevalinea1.getEnd());
        System.out.println("");
        nuevalinea2.setBegin(end0);
        nuevalinea2.setEnd(begin0);
        System.out.println(nuevalinea2);
        System.out.println("");
        nuevalinea1.setBeginX(4);
        nuevalinea1.setBeginY(5);
        nuevalinea1.setEndX(1);
        nuevalinea1.setEndY(0);
        System.out.println(nuevalinea1);
        System.out.println(Arrays.toString(nuevalinea1.getBeginXY()));
        System.out.println(Arrays.toString(nuevalinea1.getEndXY()));
        System.out.println("");
        nuevalinea2.setBeginXY(0,0);
        nuevalinea2.setEndXY(5,5);
        System.out.println(nuevalinea2);
        System.out.println("");
        System.out.println(nuevalinea2.getLength());
        System.out.println(nuevalinea2.getGradient());
    }
}
