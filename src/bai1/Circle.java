package bai1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Circle {
    private float banKinh;
    private String mauSac;

    public Circle() {
    }

    public Circle(float banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

    public float getBanKinh() {
        return this.banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    public String getMauSac() {
        return this.mauSac;

    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;

    }

    public double tinhDienTich() {
        return (Math.pow(this.banKinh, 2) * Math.PI);
    }


    @Override
    public String toString() {
        return "Circle: " +
                "banKinh=" + banKinh +
                ", mauSac= " + mauSac +
                ", dienTich= " + tinhDienTich() + '\'' ;
    }
}
