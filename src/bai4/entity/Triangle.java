package bai4.entity;

import java.util.Scanner;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    private double chieuCao;

    public Triangle() {
        super("do");
        side1=1;
        side2=1;
        side3=1;

    }

    public Triangle(String mauSac, double side1, double side2, double side3) {
        super(mauSac);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }



    public void inputData(Scanner sc) {
        System.out.println("nhập vào màu sắc của tam giác");
        this.mauSac = sc.nextLine();
        System.out.println("nhập vào độ dài cạnh thứ 1");
        this.side1 = Double.parseDouble(sc.nextLine());
        System.out.println("nhập vào độ dài cạnh thứ 2");
        this.side2 = Double.parseDouble(sc.nextLine());
        System.out.println("nhập vào độ dài cạnh thứ 3");
        this.side3 = Double.parseDouble(sc.nextLine());
    }

    public double getArea() {
        double a = getSide1();
        double b = getSide2();
        double c = getSide3();
        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && b == c) {
                //tam giac deu
                this.chieuCao = a * (Math.sqrt(3) / 2);
                return  (Math.pow(a, 2) * Math.sqrt(3)) / 4;
            } else if (Math.pow(c, 2) == (Math.pow(a, 2) + Math.pow(b, 2))) {
                //tam giac vuong
                return  (a * b) / 2;
            } else {
                //tam giac thuong
                double p = (a + b + c) / 2;
                return Math.sqrt(p * (p - a) * (p - b) * (p - c));
            }
        } else {
           return  -1;
        }
    }

    public double getPerimeter() {
        double a = getSide1();
        double b = getSide2();
        double c = getSide3();
        if (a + b > c && b + c > a && a + c > b) {
            return side1 + side2 + side3;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", mauSac=" + mauSac +
                ", chuVi=" + getPerimeter() +
                ", dienTich=" + getArea() + '\'' +
                '}';
    }
}
