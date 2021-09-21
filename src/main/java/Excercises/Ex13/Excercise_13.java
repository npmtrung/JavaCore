package Excercises.Ex13;

import java.util.Scanner;

import static Excercises.Ex13.CheckBMIException.isDouble;

public class Excercise_13 {
    public static void main(String[] args) throws CheckBMIException {
        Scanner scanner = new Scanner(System.in);
        try {
            double tempCanNang, tempChieuCao;
            System.out.print("Nhập cân nặng(kg): ");
            String canNang = scanner.nextLine();
            if (isDouble(canNang)) {
                tempCanNang = Double.parseDouble(canNang);
            } else {
                throw new CheckBMIException("Cân nặng không đúng định dạng");
            }
            if (tempCanNang <= 0) throw new CheckBMIException("Cân nặng không hợp lệ");
            System.out.print("Nhập chiều cao(m): ");
            String chieuCao = scanner.nextLine();
            if (isDouble(chieuCao)) {
                tempChieuCao = Double.parseDouble(chieuCao);
            } else {
                throw new CheckBMIException("Chiều cao không đúng định dạng");
            }
            if (tempChieuCao <= 0) throw new CheckBMIException("Chiều cao không hợp lệ");
            BMI.calculateBMI(tempCanNang, tempChieuCao);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
