package bai3.run;
import bai3.entity.MovablePoint;
import bai3.entity.Point;
public class Test {
    public static void main(String[] args) {
        Point point =new Point(5,6);
        System.out.println(point);
        MovablePoint movablePoint=new MovablePoint(0,0,2,3);
        System.out.println(movablePoint.move());
        System.out.println(movablePoint.move());
        System.out.println(movablePoint.reMove());
        System.out.println(movablePoint.move());
    }
}
