package bai4.entity;

public class Shape {
    protected  String mauSac;

    public Shape() {
    }

    public Shape(String mauSac) {
        this.mauSac = mauSac;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "mauSac='" + mauSac + '\'' +
                '}';
    }
}
