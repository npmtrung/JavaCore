package Excercises.Ex12;

import java.util.Scanner;

import java.util.Scanner;

public class MiengDatHinhTron extends MiengDat {
    private Diem center;
    private int radius;

    public MiengDatHinhTron() {
    }

    public MiengDatHinhTron(Diem center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void input() {
        System.out.println("Nhập tọa độ tâm đường tròn: ");
        System.out.print("x: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();
        this.center = new Diem(x, y);
        System.out.print("Nhập bán kính: ");
        this.radius = scanner.nextInt();
    }

    //Tính diện tích đất
    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        MiengDatHinhTron circle = new MiengDatHinhTron();
        final StringBuffer sb = new StringBuffer("Miếng đất hình tròn {");
        sb.append("Tọa độ tâm: ").append(center.toString());
        sb.append(", bán kính: ").append(radius);
        sb.append(" ,diện tích: ").append(calculateArea());
        sb.append('}');
        return sb.toString();
    }
}
