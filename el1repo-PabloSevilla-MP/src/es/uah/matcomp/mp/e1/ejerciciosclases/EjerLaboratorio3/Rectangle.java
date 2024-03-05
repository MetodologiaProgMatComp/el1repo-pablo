package es.uah.matcomp.mp.e1.ejerciciosclases.EjerLaboratorio3;

public class Rectangle {

    private Float length=1.0f;
    private Float width=1.0f;
    public Rectangle() {
    }
    public Rectangle(Float l, Float w) {
        this.length= l;
        this.width=w;
    }
    public float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*length+2*width;
    }
    public String toString(){
        return "Rectangle[length= "+length+", width= "+width+"]";
    }
}
