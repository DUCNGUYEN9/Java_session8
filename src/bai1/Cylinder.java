package bai1;

public class Cylinder extends Circle {
    private float chieuCao;

    public Cylinder() {
    }

    public Cylinder(float banKinh, String mauSac, float chieuCao) {
        super(banKinh, mauSac);
        this.chieuCao = chieuCao;
    }

    public float getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(float chieuCao) {
        this.chieuCao = chieuCao;
    }
    public double tinhTheTich(){
        return tinhDienTich()*this.chieuCao;
    }


    @Override
    public String toString() {
        return "Cylinder: " +
                "banKinh=" + getBanKinh() +
                ", mauSac=" + getMauSac() +
                ", chieuCao=" + chieuCao +
                ", theTich=" + tinhTheTich() ;
    }
}
