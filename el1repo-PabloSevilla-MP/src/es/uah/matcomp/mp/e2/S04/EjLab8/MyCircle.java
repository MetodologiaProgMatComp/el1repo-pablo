package es.uah.matcomp.mp.e2.S04.EjLab8;

import es.uah.matcomp.mp.e2.S04.EjLab7.MyPoint;

public class MyCircle {
    MyPoint center = new MyPoint();
    int radius=1;

    public MyCircle(){
    }
    public MyCircle(int x, int y, int radius){
        center.setX(x);
        center.setY(y);
        this.radius=radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        center.setY(y);
    }
    public int[] getCenterXY(){
        int[] centro = new int[]{center.getX(),center.getY()};
        return centro;
    }
    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }
    public String toString(){
        return "MyCircle [radius= "+radius+", center= "+center.toString()+"]";
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumference(){

    }
}
