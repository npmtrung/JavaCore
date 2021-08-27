package Excercises;

import java.util.Scanner;

public class Excercise_10 {
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

        System.out.println("----- Tam Giác -----");
        TamGiac tamgiac = new TamGiac();
        tamgiac.nhapCanhTamGiac();
        tamgiac.inTamGiac();
        System.out.printf("Chu vi tam giác là: %d\n", tamgiac.chuViTamGiac());
        System.out.printf("Diện tích tam giác là: %s\n", tamgiac.dientichTamGiac());
        System.out.println("----------");
    }
}
