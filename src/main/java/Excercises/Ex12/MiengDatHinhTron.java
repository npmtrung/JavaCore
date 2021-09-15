package Excercises.Ex12;

import java.util.Scanner;

public class MiengDatHinhTron extends MiengDat {
    private int banKinh;

    public MiengDatHinhTron() {
    }

    public MiengDatHinhTron(int point, int banKinh) {
        super(point);
        this.banKinh = banKinh;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Miếng đất hình tròn có thông tin (");
        sb.append("bán kính: ").append(banKinh);
        sb.append(", tâm: ").append(point);
        sb.append(" ,giá đất: ").append(gia);
        sb.append(')');
        return sb.toString();
    }

    public int giaDat(int gia1m) {
        return (int) (gia1m * (this.banKinh + this.banKinh) * (this.banKinh + this.banKinh) * Math.PI);
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tâm của miếng đất: ");
        this.point = scanner.nextInt();
        System.out.print("Nhập bán kính miếng đất: ");
        this.banKinh = scanner.nextInt();
        System.out.print("Nhập giá 1m2 đất: ");
        int gia1m = scanner.nextInt();
        this.gia = giaDat(gia1m);
    }
}
