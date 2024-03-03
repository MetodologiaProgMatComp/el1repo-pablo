package es.uah.matcomp.mp.e2.S04.EjLab9;
import es.uah.matcomp.mp.e2.S04.EjLab7.MyPoint;

public class MyTriangle {
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public MyTriangle(int x1, int x2, int x3, int y1, int y2, int y3){
        v1 = new MyPoint(x1,y1);
        v2 = new MyPoint(x2,y2);
        v3 = new MyPoint(x3,y3);


    }
    public String toString(){
        return "MyTriangle= [v1 = "+v1+", v2 = "+v2+", v3 = "+v3+"]";
    }
    public double getPerimeter(){
        double lado1= v1.distance(v2);
        double lado2= v2.distance(v3);
        double lado3= v3.distance(v1);
        return lado1+lado2+lado3;
    }
    public String getType(){
        double lado1= v1.distance(v2);
        double lado2= v2.distance(v3);
        double lado3= v3.distance(v1);
        if (lado3==lado2 & lado2==lado1){
            return "Equilateral";
        }
        if (lado3==lado2 || lado2==lado1 || lado1==lado3){
            return "Isosceles";
        }
        if (lado3!=lado2 & lado2!=lado1 & lado1!=lado3){
            return "Scalene";
        }
        return "Not triangle";
    }
}
