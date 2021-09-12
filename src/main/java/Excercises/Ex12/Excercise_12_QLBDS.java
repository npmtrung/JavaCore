package Excercises.Ex12;

import java.util.ArrayList;
import java.util.Scanner;

public class Excercise_12_QLBDS {
    public static void main(String[] args) {
        int choose;
        Scanner scanner = new Scanner(System.in);
        ArrayList<MiengDat> arrMiengDat = new ArrayList<>();
        MiengDat miengDat;

        System.out.print("Nhập số lượng miếng đất: ");
        int soMiengDat = scanner.nextInt();

        System.out.println("Nhập thông tin miếng đất: ");
        System.out.print("Chọn hình dạng miếng đất (0 - đất hình chữ nhật, "
                + "1 - đất tam giác, 2 - đất hình vuông, 3 - đất hình tròn): ");
        choose = scanner.nextInt();
        switch (choose) {
            case 0:
                miengDat = new MiengDatHinhChuNhat();
                miengDat.nhap();

                break;
            case 1:
                miengDat = new MiengDatHinhTamGiac();
                miengDat.nhap();
                miengDat.tinhDienTich();
                miengDat.tinhTien();
                break;
            default:
                System.out.println("Bạn nhập không đúng. Mời nhập lại");
                break;
        }

    }
}
