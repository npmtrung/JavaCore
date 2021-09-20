package Excercises.Ex13;

import java.util.Scanner;

public class Excercise_13 {
    public static void main(String[] args) throws CheckException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập cân nặng(kg): ");
            double canNang = scanner.nextDouble();
            if (canNang <= 0) throw new CheckException("Cân nặng không hợp lệ");
            System.out.print("Nhập chiều cao(m): ");
            double chieuCao = scanner.nextDouble();
            if (chieuCao <= 0) throw new CheckException("Chiều cao không hợp lệ");
            BMI.calculateBMI(canNang, chieuCao);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
