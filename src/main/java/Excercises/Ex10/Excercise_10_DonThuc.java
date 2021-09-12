package Excercises.Ex10;

import java.util.Scanner;

public class Excercise_10_DonThuc {
    public static void main(String[] args) {
        System.out.println("----- Đơn Thức -----");
        System.out.print("Nhập hệ số a trong đơn thức ax^n: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhập số mũ n trong đơn thức ax^n: ");
        int n = new Scanner(System.in).nextInt();
        DonThuc donThuc = new DonThuc(a, n);
        System.out.print("Đơn thức vừa nhập là: ");
        donThuc.inDonThuc();
        System.out.println("----------");

        System.out.print("Nhập hệ số a trong đơn thức thứ 2: ");
        int a1 = new Scanner(System.in).nextInt();
        System.out.print("Nhập số mũ n trong đơn thức thứ 2: ");
        int n1 = new Scanner(System.in).nextInt();
        DonThuc donThuc1 = new DonThuc(a1, n1);
        DonThuc tichDonThuc = donThuc.nhanDonThuc(donThuc1);
        System.out.print("Tích 2 đơn thức vừa nhập là: ");
        tichDonThuc.inDonThuc();
        DonThuc thuongDonThuc = donThuc.chiaDonThuc(donThuc1);
        System.out.print("Thương 2 đơn thức vừa nhập là: ");
        thuongDonThuc.inDonThuc();
        System.out.println("----------");

        System.out.print("Đạo hàm bậc 1 của đơn thức 1: ");
        donThuc.daoHamDonThuc();
        donThuc.inDonThuc();
        System.out.print("Đạo hàm bậc 1 của đơn thức 2: ");
        donThuc1.daoHamDonThuc();
        donThuc1.inDonThuc();
        System.out.println("----------");

        System.out.print("Nhập giá trị x của đơn thức ax^n: ");
        int x0 = new Scanner(System.in).nextInt();
        double kq = (a * x0) ^ n;
        System.out.format("Giá trị của đơn thức 1 là: " + kq + "\n");
        double kq1 = (a1 * x0) ^ n1;
        System.out.format("Giá trị của đơn thức 2 là: " + kq1 + "\n");
        System.out.println("----------");

        System.out.println("----- Điểm -----");
        Diem d2 = new Diem();
        System.out.println(d2);

        d2.setX(4);
        d2.setY(3);
        System.out.println(d2);

        d2.setX(14);
        d2.setY(13);
        System.out.println(d2);

        Diem d3 = new Diem(2, 2);
        System.out.println(d3);

        Diem d4 = Diem.generate();
        System.out.println(d4);
        System.out.println(d4.detectQuadrant());
        System.out.println("------------------");

        double n2 = d2.distance(d3);
        System.out.println(n);

        System.out.println(d3.findCentralSymmetry());
        System.out.println(d3.findXAxisSymmetry());
        System.out.println(d3.findYAxisSymmetry());

        System.out.println("----- Tam Giác -----");
//        TamGiac tamgiac = new TamGiac();
//        tamgiac.nhapCanhTamGiac();
//        tamgiac.inTamGiac();
//        System.out.printf("Chu vi tam giác là: %d\n", tamgiac.chuViTamGiac());
//        System.out.printf("Diện tích tam giác là: %s\n", tamgiac.dientichTamGiac());
//        System.out.println("----------");
        //sửa bài
        TamGiac tg1 = new TamGiac();
        System.out.println(tg1);

        System.out.format("P = %f\n", tg1.calculatePerimeter());
        System.out.format("S = %f\n", tg1.calculateArea());
    }
}
