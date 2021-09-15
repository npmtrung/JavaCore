package Excercises.Ex12;

import java.util.Scanner;

public class MiengDatHinhVuong extends MiengDat {
    public MiengDatHinhVuong() {
    }

    public MiengDatHinhVuong(int chieuRong, int point) {
        super(chieuRong, point);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Miếng đất hình vuông có thông tin (");
        sb.append("chiều rộng: ").append(chieuRong);
        sb.append(", điểm trái trên: ").append(point);
        sb.append(" ,giá đất: ").append(gia);
        sb.append(')');
        return sb.toString();
    }

    public int giaDat(int gia1m) {
        return gia1m * this.chieuRong * this.chieuRong;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng miếng đất: ");
        this.chieuRong = scanner.nextInt();
        System.out.print("Nhập điểm trái trên miếng đất: ");
        this.point = scanner.nextInt();
        System.out.print("Nhập giá 1m2 đất: ");
        int gia1m = scanner.nextInt();
        this.gia = giaDat(gia1m);
    }
}
