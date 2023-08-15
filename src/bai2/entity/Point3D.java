package bai2.entity;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }



    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        setX(x);
        setY(y);
        this.z=z;

    }
    public float[] getXYZ(){
        float[] arrXYZ= new float[3];
        arrXYZ[0]=getX();
        arrXYZ[1]=getY();
        arrXYZ[2]=z;
        return arrXYZ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                "y=" + getY() +
                "z=" + z +
                '}';
    }
}
