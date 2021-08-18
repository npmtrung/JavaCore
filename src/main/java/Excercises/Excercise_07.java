package Excercises;

import java.util.Scanner;

public class Excercise_07 {
    public static void main(String[] args) {

        int[][] a = NumberUtils.generateMatrix(5, 5, 0, 50);

        // Bài 1:
        System.out.print("Nhập số cần tìm trong Matrix: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (NumberUtils.findX(a, x)) {
            System.out.format("Có giá trị %d trong mảng", x);
        } else {
            System.out.format("Không có giá trị %d trong mảng", x);
        }
        System.out.println();

        // Bài 2:
        if (NumberUtils.isPrimeMatrix(a)) {
            System.out.println("Mảng toàn số nguyên tố");
        } else {
            System.out.println("Mảng có phần tử không phải số nguyên tố");
        }

        // Bài 3:
        int max = NumberUtils.findMax(a);
        System.out.format("Phần tử %d là phần tử lớn nhất của mảng", max);
    }

}
