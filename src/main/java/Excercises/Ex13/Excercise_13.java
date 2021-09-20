package Excercises.Ex13;

import java.util.Scanner;

import static Excercises.Ex13.CheckException.isDouble;

public class Excercise_13 {
    public static void main(String[] args) throws CheckException {
        Scanner scanner = new Scanner(System.in);
        try {
            double tempCanNang, tempChieuCao;
            System.out.print("Nhập cân nặng(kg): ");
            String canNang = scanner.nextLine();
            if (isDouble(canNang)) {
                tempCanNang = Double.parseDouble(canNang);
            } else {
                throw new CheckException("Cân nặng không đúng định dạng");
            }
            if (tempCanNang <= 0) throw new CheckException("Cân nặng không hợp lệ");
            System.out.print("Nhập chiều cao(m): ");
            String chieuCao = scanner.nextLine();
            if (isDouble(canNang)) {
                tempChieuCao = Double.parseDouble(chieuCao);
            } else {
                throw new CheckException("Chiều cao không đúng định dạng");
            }
            if (tempChieuCao <= 0) throw new CheckException("Chiều cao không hợp lệ");
            BMI.calculateBMI(tempCanNang, tempCanNang);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
