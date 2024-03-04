package es.uah.matcomp.mp.e3.S05.Herencia.EjLab6;

public class Main {
    //Es el main de Linesub
    public static void main(String[] args){
        LineSub linea1 = new LineSub(2,2,6,-1);
        Point begin = new Point(1,0);
        Point end = new Point(0,3);
        LineSub linea2 = new LineSub(begin,end);
        linea1.setBegin(end);
        linea1.setEnd(1,0);
        System.out.println(linea1.getBegin());
        System.out.println(linea1.getEnd());
        linea2.setBeginX(1);
        linea2.setBeginY(3);
        linea2.setEndX(-1);
        linea2.setEndY(4);
        System.out.println(linea2.getBeginX());
        System.out.println(linea2.getBeginY());
        System.out.println(linea2.getEndX());
        System.out.println(linea2.getEndY());
        linea1.setBeginXY(0,0);
        linea1.setEndXY(4,4);
        System.out.println(linea1);
        System.out.println(linea1.getLength());
        System.out.println(linea2.getGradient());

//// Para este caso, realmente me parecen útiles ambos métodos, pero me quedaría con el de composición por la facilidad de usar los métodos de Point sobre los puntos de la línea.


    }
}
