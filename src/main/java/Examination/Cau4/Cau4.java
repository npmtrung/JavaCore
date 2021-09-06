package Examination.Cau4;

import java.util.Scanner;

public class Cau4 {
    public static void main(String[] args) {
        System.out.print("Nhập số lượng hành khách: ");
        int soLuong = new Scanner(System.in).nextInt();

        System.out.println("Nhập thông tin hành khách: ");
        Passenger[] dsHanhKhach = Passenger.nhapDSHanhKhach(soLuong);

        System.out.println("Danh sách hành khách: ");
        Passenger.xuatDSHanhKhach(dsHanhKhach);

        System.out.println("Danh sách hành khách sau khi sắp xếp: ");
        Passenger[] dsSapXep = dsHanhKhach;
        Passenger.sapXepGiaVeGiamDan(dsSapXep);
    }

}
