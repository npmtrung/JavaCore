package Excercises.Ex12;
import java.util.Scanner;

public class MiengDatHinhTamGiac extends MiengDat {
    private int point1, point2;

    public MiengDatHinhTamGiac() {
    }

    public MiengDatHinhTamGiac(int point, int point1, int point2) {
        super(point);
        this.point1 = point1;
        this.point2 = point2;
    }

    public double chuVi() {
        int result = 0;
        result += this.point1 + this.point2 + this.point;
        return result;
    }

    public double area() {
        double dienTich;
        double p = chuVi() / 2;
        dienTich = Math.sqrt(p * (p - this.point1) * (p - this.point2) * (p - this.point));
        return dienTich;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Miếng đất hình tam giác có thông tin (");
        sb.append("đỉnh A: ").append(point1);
        sb.append(", đỉnh B: ").append(point2);
        sb.append(", đỉnh C: ").append(point);
        sb.append(" ,giá đất: ").append(gia);
        sb.append(')');
        return sb.toString();
    }

    public int giaDat(int gia1m) {
        return (int) (gia1m * area());
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đỉnh A: ");
        this.point1 = scanner.nextInt();
        System.out.print("Nhập đỉnh B: ");
        this.point2 = scanner.nextInt();
        System.out.print("Nhập đỉnh C: ");
        this.point = scanner.nextInt();
        System.out.print("Nhập giá 1m2 đất: ");
        int gia1m = scanner.nextInt();
        this.gia = giaDat(gia1m);
    }
}
