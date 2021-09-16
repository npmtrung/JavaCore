package Excercises.Ex12;

import java.util.Scanner;

public class MiengDatHinhChuNhat extends MiengDat {
    private Diem topLeft;
    private int width, height;

    public MiengDatHinhChuNhat() {
    }

    public MiengDatHinhChuNhat(Diem topLeft, int width, int height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }


    @Override
    public void input() {
        System.out.println("Nhập tọa độ điểm trái trên: ");
        System.out.print("x: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();
        this.topLeft = new Diem(x, y);

        System.out.print("Nhập chiều dài: ");
        this.height = scanner.nextInt();
        System.out.print("Nhập chiều rộng: ");
        this.width = scanner.nextInt();
    }

    //Tính diện tích đất
    @Override
    public double calculateArea() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        MiengDatHinhChuNhat rectangle = new MiengDatHinhChuNhat();
        final StringBuffer sb = new StringBuffer("Miếng đất hình chữ nhật {");
        sb.append("Điểm trái trên: ").append(topLeft.toString());
        sb.append(", chiều dài: ").append(height);
        sb.append(", chiều rộng: ").append(width);
        sb.append(" ,diện tích: ").append(calculateArea());
        sb.append('}');
        return sb.toString();
    }
}
