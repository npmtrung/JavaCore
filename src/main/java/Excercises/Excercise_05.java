package Excercises;

import java.util.Scanner;

public class Excercise_05 {
    public static void main(String[] args) {
        //bài2b
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số lượng phần tử trong mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int[] array2b = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.format("Phần tử thứ [%d]: ", i + 1);
            array2b[i] = scanner.nextInt();
        }
        System.out.print("Mảng vừa nhập: ");
        NumberUtils.printArray(array2b);
        boolean checkPrimeArray = NumberUtils.isPrimeArray(array2b);
        if (checkPrimeArray) {
            System.out.println("Mảng chứa toàn số nguyên tố");
        } else {
            System.out.println("Mảng không chứa toàn số nguyên tố");
        }

        //bài2c


    }
}

