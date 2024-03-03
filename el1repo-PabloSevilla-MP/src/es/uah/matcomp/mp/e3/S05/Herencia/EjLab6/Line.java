package es.uah.matcomp.mp.e3.S05.Herencia.EjLab6;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin= new Point(beginX, beginY);
        end= new Point(endX,endY);
    }

    public String toString(){
        return "Line from "+begin+" to "+end;
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    public int getBeginX(){
        return begin.getX();
    }
    public int getBeginY(){
        return begin.getY();
    }
    public int getEndX(){
        return end.getX();
    }
    public int getEndY(){
        return end.getY();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public void setBeginY(int y){
        begin.setY(y);
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public void setEndY(int y){
        end.setY(y);
    }
    public void setBeginXY(int x, int y){
        begin.setXY(x,y);
    }
    public void setEndXY(int x, int y){
        end.setXY(x,y);
    }
    public double getLength(){
        return Math.sqrt((end.getX()-begin.getX())*(end.getX()-begin.getX())+(end.getY()-begin.getY())*(end.getY()-begin.getY()));
    }
    public double getGradient(){
        return Math.atan2(end.getY()-begin.getY(),end.getX()-begin.getX());
    }
}
