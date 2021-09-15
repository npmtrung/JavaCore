package Excercises.Ex12;

import java.util.Scanner;

public class MiengDatHinhVuong extends MiengDat {
    private Diem topLeft;
    private int width;

    public MiengDatHinhVuong() {
    }

    public MiengDatHinhVuong(Diem topLeft, int width) {
        this.topLeft = topLeft;
        this.width = width;
    }

    @Override
    public void input() {
        System.out.println("Nhập tọa độ điểm trái trên: ");
        System.out.print("x = ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();
        this.topLeft = new Diem(x, y);

        System.out.print("Nhập chiều rộng: ");
        this.width = scanner.nextInt();
    }

    @Override
    public double calculateArea() {
        return this.width * this.width;
    }

    @Override
    public String toString() {
        MiengDatHinhVuong square = new MiengDatHinhVuong();
        final StringBuffer sb = new StringBuffer("Miếng đất hình vuông {");
        sb.append("Điểm trái trên = ").append(topLeft.toString());
        sb.append(", chiều rộng = ").append(width);
        sb.append(" ,diện tích: ").append(calculateArea());
        sb.append('}');
        return sb.toString();
    }
}
