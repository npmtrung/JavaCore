package Excercises.Ex12;

import java.util.Scanner;

public class MiengDatHinhTamGiac extends MiengDat {
    private Diem p1;
    private Diem p2;
    private Diem p3;

    public MiengDatHinhTamGiac() {
        this.p1 = Diem.generate();
        this.p2 = Diem.generate();
        this.p3 = Diem.generate();
    }

    public MiengDatHinhTamGiac(Diem p1, Diem p2, Diem p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double calculateArea() {
        double a = this.p1.distance(this.p2);
        double b = this.p1.distance(this.p3);
        double c = this.p2.distance(this.p3);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm A: ");
        int p1 = scanner.nextInt();
        System.out.print("Nhập điểm B: ");
        int p2 = scanner.nextInt();
        System.out.print("Nhập điểm C: ");
        int p3 = scanner.nextInt();
    }

    @Override
    public String toString() {
        MiengDatHinhTamGiac triangle = new MiengDatHinhTamGiac();
        final StringBuilder sb = new StringBuilder("Miếng đất hình tam giác {\n");
        sb
                .append("Cạnh A: ").append("(").append(p1.getX()).append(", ").append(p1.getY()).append(")")
                .append(", cạnh B: ").append("(").append(p2.getX()).append(", ").append(p2.getY()).append(")")
                .append(", cạnh C: ").append("(").append(p3.getX()).append(", ").append(p3.getY()).append(")");
        sb.append(", diện tích: ").append(calculateArea());
        sb.append('}');
        return sb.toString();
    }
}
