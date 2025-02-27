package es.uah.matcomp.mp.e3.S05.Herencia.EjLab3;

public class Point3D extends Point2D{
    float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float[] coord = new float[]{super.getX(),super.getY(),z};
        return coord;
    }

    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.setZ(z);
    }
    @Override
    public String toString(){
        return "("+super.getX()+","+super.getY()+","+z+")";
    }
}
