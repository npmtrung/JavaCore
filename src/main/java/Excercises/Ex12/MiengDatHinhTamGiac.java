package Excercises.Ex12;

import Excercises.Ex12.Diem;

public class MiengDatHinhTamGiac extends MiengDat {
    protected Diem p1, p2, p3;

    public MiengDatHinhTamGiac() {
        super();
    }

    public MiengDatHinhTamGiac(Diem p1, Diem p2, Diem p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public double tinhDienTich() {
        double a = this.p1.distance(this.p2);
        double b = this.p1.distance(this.p3);
        double c = this.p2.distance(this.p3);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void nhap() {
        super.nhap();
        do {
            System.out.print("Nhập điểm A: ");
            Diem p1 = scanner.nextInt();
            System.out.print("Nhập chiều cao: ");
            chieuCao = scanner.nextInt();
        } while ((day < 0) || (chieuCao < 0));
    }

//    @Override
//    public double tinhDienTich() {
//        return (this.day * this.chieuCao) / 2;
//    }

    @Override
    public long tinhTien() {
        return this.donGia * (long) this.tinhDienTich();
    }

//    @Override
//    public String toString() {
//        return super.toString() + ", đáy: " + this.day +
//                ", chiều cao: " + this.chieuCao;
//    }
}
