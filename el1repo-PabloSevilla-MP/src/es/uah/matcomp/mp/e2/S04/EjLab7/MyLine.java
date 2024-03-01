package es.uah.matcomp.mp.e2.S04.EjLab7;

public class MyLine {
    MyPoint begin;
    MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1,y1);
        end= new MyPoint(x2,y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getBeginX(){
        return begin.getX();
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginX(int x1){
        begin.x= x1;
    }
    public void setBeginY(int y1){
        begin.y= y1;
    }
    public int getEndX(){
        return end.getX();
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndX(int x1){
        end.x= x1;
    }
    public void setEndY(int y1){
        end.y= y1;
    }
    public int[] getBeginXY(){
        int[] coord = new int[]{getBeginX(),getBeginY()};
        return coord;
    }
    public int[] getEndXY(){
        int[] coord = new int[]{getEndX(),getEndY()};
        return coord;
    }
    public void setBeginXY(int x, int y){
        begin.x=x;
        begin.y=y;
    }
    public void setEndXY(int x, int y){
        end.x=x;
        end.y=y;
    }
    public double getLength(){
        double num= begin.distance(end);
        return num;
    }
    public double getGradient(){
        double num= Math.atan2(end.getX()-begin.getX(), end.getY()-begin.getY());
        return num;
    }
    public String toString(){
        return "MyLine = [begin = "+begin+", end = "+end+"]";
    }
}
