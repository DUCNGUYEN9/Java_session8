package bai4.run;

import bai4.entity.Shape;
import bai4.entity.Triangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Shape shape=new Shape("yellow");
        System.out.println(shape);
        Triangle triangle=new Triangle();
        System.out.println(triangle);

        triangle.inputData(sc);
        System.out.println(triangle);
    }
}
