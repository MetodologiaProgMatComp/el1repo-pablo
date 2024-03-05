package es.uah.matcomp.mp.e4.S06.Polimorfismos.EjLab1;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double width, double length) {
        super(width, length);
    }

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }
    public double getSide(){
        if (super.length==super.width){
            return super.getLength();
        }
        else{
            return 0;
        }
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public String toString(){
        return "Square = ["+super.toString()+"]";
    }
}
