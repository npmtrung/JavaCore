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

        int num1, reversed = 0;
        System.out.print("Nhập vào số cần kiểm tra đối xứng: ");
        num1 = scanner.nextInt();
        int original = num1;
        while (num1 != 0) {
            int digit = num1 % 10;
            reversed = reversed * 10 + digit;
            num1 /= 10;
        }if(reversed == original){
            System.out.format("%d là số đối xứng \n", original);
        }else{
            System.out.format("%d không phải là số đối xứng \n", original);
        }
    }
}


