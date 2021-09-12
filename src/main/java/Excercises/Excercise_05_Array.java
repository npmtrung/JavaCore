package Excercises;

import Excercises.entities.NumberUtils;

import java.util.Scanner;

public class Excercise_05_Array {
    public static void main(String[] args) {
        //bài2b
        System.out.println("Bài 2b");
        Scanner scanner = new Scanner(System.in);
        int n1;
        do {
            System.out.print("Nhập số lượng phần tử trong mảng: ");
            n1 = scanner.nextInt();
        } while (n1 <= 0);
        int[] array2b = new int[n1];
        for (int i = 0; i < n1; i++) {
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
        System.out.println("Bài 2c");
        int n2;
        do {
            System.out.print("Nhập số lượng phần tử trong mảng: ");
            n2 = scanner.nextInt();
        } while (n2 <= 0);
        int[] array2c = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.format("Phần tử thứ [%d]: ", i + 1);
            array2c[i] = scanner.nextInt();
        }
        System.out.print("Mảng vừa nhập: ");
        NumberUtils.printArray(array2c);
        boolean isAscending = NumberUtils.isAscendingArray(array2c);
        if (isAscending) {
            System.out.println("Mảng tăng dần");
        } else {
            System.out.println("Mảng KHÔNG tăng dần");
        }

        //bài 3a
        System.out.println("Bài 3a");
        int n3;
        do {
            System.out.print("Nhập số lượng phần tử trong mảng: ");
            n3 = scanner.nextInt();
        } while (n3 <= 0);
        int[] array3a = new int[n3];
        for (int i = 0; i < n3; i++) {
            System.out.format("Phần tử thứ [%d]: ", i + 1);
            array3a[i] = scanner.nextInt();
        }
        System.out.print("Mảng vừa nhập: ");
        NumberUtils.printArray(array3a);
        int count = NumberUtils.countDivisible(array3a);
        System.out.format("Có %d số chia hết cho 4 nhưng không chia hết cho 5 \n", count);

        //bài 3b
        System.out.println("Bài 3b");
        int n4;
        do {
            System.out.print("Nhập số lượng phần tử trong mảng: ");
            n4 = scanner.nextInt();
        } while (n4 <= 0);
        int[] array3b = new int[n4];
        for (int i = 0; i < n4; i++) {
            System.out.format("Phần tử thứ [%d]: ", i + 1);
            array3b[i] = scanner.nextInt();
        }
        System.out.print("Mảng vừa nhập: ");
        NumberUtils.printArray(array3b);
        int sum = NumberUtils.sumPrimeNumber(array3b);
        System.out.format("Tổng các số nguyên tố trong mảng là %d", sum);
    }
}


