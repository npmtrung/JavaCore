package Excercises.Ex12;

import java.util.Scanner;

public class MiengDatHinhChuNhat extends MiengDat {
    public MiengDatHinhChuNhat() {
    }

    public MiengDatHinhChuNhat(int chieuDai, int chieuRong, int point) {
        super(chieuDai, chieuRong, point);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Miếng đất hình chữ nhật có thông tin (");
        sb.append("dài: ").append(chieuDai);
        sb.append(", rộng: ").append(chieuRong);
        sb.append(", điểm trái trên: ").append(point);
        sb.append(" ,giá đất: ").append(gia);
        sb.append(')');
        return sb.toString();
    }

    public int giaDat(int gia1m) {
        return this.chieuDai * this.chieuRong * gia1m;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        this.chieuDai = scanner.nextInt();
        System.out.print("Nhập chiều rộng: ");
        this.chieuRong = scanner.nextInt();
        System.out.print("Nhập điểm trái trên: ");
        this.point = scanner.nextInt();
        System.out.print("Nhập giá 1m2 đất: ");
        int gia1m = scanner.nextInt();
        this.gia = giaDat(gia1m);
    }
}
