package bai2.run;

import bai2.entity.Point2D;
import bai2.entity.Point3D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(4, 5);
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D();
        point3D.setXYZ(4,5,6);
        System.out.println(point3D.toString());

    }

}
