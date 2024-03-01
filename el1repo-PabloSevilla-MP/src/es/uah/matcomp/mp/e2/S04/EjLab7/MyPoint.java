package es.uah.matcomp.mp.e2.S04.EjLab7;

public class MyPoint {
    int x=0;
    int y=0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int[] coord= new int[]{x,y};
        return coord;
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    public double distance(int x, int y){
        double ancho = x - this.x;
        double alto = y - this.y;
        double distance = Math.sqrt(ancho*ancho+alto*alto);
        return distance;
    }
    public double distance(MyPoint another){
        double ancho= another.getX() - this.x;
        double alto = another.getY() - this.y;
        double distance = Math.sqrt(ancho*ancho+alto*alto);
        return distance;
    }
    public double distance(){
        double ancho = -x;
        double alto = -y;
        double distance = Math.sqrt(ancho*ancho+alto*alto);
        return distance;
    }

}
