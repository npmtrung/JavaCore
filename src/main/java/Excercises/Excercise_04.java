package Excercises;
import java.util.Scanner;

public class Excercise_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra số nguyên tố: ");
        int n = scanner.nextInt();
        if (NumberUtils.isPrimeNumber(n)) {
            System.out.format("%d là số nguyên tố. \n", n);
        } else {
            System.out.format("%d không phải số nguyên tố. \n", n);
        }

        //bai1a
        System.out.println("Bài 1a");
        int num1;
        do {
            System.out.print("Nhập vào số cần kiểm tra đối xứng: ");
            num1 = scanner.nextInt();
        } while (num1 <= 0);
        if (NumberUtils.isSymmetryNumber(num1)){
            System.out.format("%d là số đối xứng \n", num1);
        } else {
            System.out.format("%d không phải là số đối xứng \n", num1);
        }

        //bai1b
        System.out.println("Bài 1b");
        int num2;
        do {
            System.out.print("Nhập vào số nguyên dương cần kiểm tra chính phương: ");
            num2 = scanner.nextInt();
        } while (num2 <= 0);
        double result = Math.sqrt(num2);
        if(num2 % result == 0){
            System.out.println(num2 + " là số chính phương");
        } else {
            System.out.println(num2 + " không phải là số chính phương");
        }

        //bai2d
        System.out.println("Bài 2d");
        int num3;
        int factorial = 1;
        do {
            System.out.print("Nhập vào số nguyên dương để tính giai thừa: ");
            num3 = scanner.nextInt();
        } while (num3 < 0);
        int factorialNo = NumberUtils.factorialCalc(num3);
        System.out.format("Giai thừa của %d là: %d\n",num3,factorialNo);

        //bai2e
        System.out.println("Bài 2e");
        int num4;
        System.out.print("Nhập vào số nguyên dương để tính tổng giai thừa: ");
        num4 = scanner.nextInt();
        int sumFactorial = NumberUtils.sumFactorial(num4);
        System.out.format("Tổng giai thừa của %d là: %d\n",num4,sumFactorial);

        //bai4
        System.out.println("Bài 4");
        int num5;
        int sum4 = 0;
        do {
            System.out.print("Nhập số N trong khoảng từ 0 đến 50: ");
            num5 = scanner.nextInt();
       } while (num5 <= 0 || num5 >= 50);
        System.out.format("Tất cả các số nguyên tố nhỏ hơn %d là:", num5);
        for (int i = 2; i < num5; i++) {
            if (NumberUtils.isPrimeNumber(i)) {
                    System.out.print(" " + i);
                    sum4 = sum4 + i;
                }
            }
        System.out.format("\nTổng của các số nguyên tố nhỏ hơn %d là: %d\n",num5,sum4);

        //bai5
        System.out.println("Bài 5");
        System.out.print("Nhập vào số nguyên dương cần đảo ngược: ");
        int num6 = scanner.nextInt();
        int reversedNumber = NumberUtils.reverseNumber(num6);
        System.out.format("Số đảo ngược của số %d là: %d",num6,reversedNumber);
    }
}




