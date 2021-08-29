package Excercises;

import Excercises.entities.NumberUtils;

import java.util.Scanner;

public class Excercise_07 {
    public static void main(String[] args) {

        System.out.print("Nhập số dòng của Demo.Matrix: ");
        int row = new Scanner(System.in).nextInt();
        System.out.print("Nhập số cột của Demo.Matrix: ");
        int column = new Scanner(System.in).nextInt();
        System.out.print("Nhập giá trị nhỏ nhất của Demo.Matrix: ");
        int min = new Scanner(System.in).nextInt();
        System.out.print("Nhập giá trị lớn nhất của Demo.Matrix: ");
        int max = new Scanner(System.in).nextInt();
        int[][] a = NumberUtils.generateMatrix(row, column, min, max);
        NumberUtils.printMatrix(a);

        //bài1
        System.out.println("Bài 1");
        System.out.print("Nhập số cần tìm trong Demo.Matrix: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (NumberUtils.findX(a, x)) {
            System.out.format("Có giá trị %d trong mảng", x);
        } else {
            System.out.format("Không có giá trị %d trong mảng", x);
        }
        System.out.println();

        //bài2
        System.out.println("Bài 2");
        if (NumberUtils.isPrimeMatrix(a)) {
            System.out.println("Mảng toàn số nguyên tố");
        } else {
            System.out.println("Mảng có phần tử không phải số nguyên tố");
        }

        //bài3
        System.out.println("Bài 3");
        int maxNumber = NumberUtils.findMax(a);
        System.out.format("Phần tử %d là phần tử lớn nhất của mảng\n", maxNumber);

        //bài4
        System.out.println("Bài 4a");
        int sumRowd = NumberUtils.sumRow(a);
        System.out.format("Tổng các phần tử trên dòng: %d\n", sumRowd);
        int sumColumnc = NumberUtils.sumColumn(a);
        System.out.format("Tổng các phần tử trên cột: %d\n", sumColumnc);

        System.out.println("Bài 4b");
        int sumMainDiagonal = NumberUtils.sumMainDiagonal(a);
        System.out.format("Tổng các phần tử trên đường chéo chính: %d\n", sumMainDiagonal);
        int sumAuxiliaryDiagonal = NumberUtils.sumAuxiliaryDiagonal(a);
        System.out.format("Tổng các phần tử trên đường chéo phụ: %d\n", sumAuxiliaryDiagonal);

        System.out.println("Bài 4c");
        int sumHalfAboveMainDiagonal = NumberUtils.sumHalfAboveMainDiagonal(a);
        System.out.format("Tổng các phần tử Nửa trên đường chéo chính: %d\n", sumHalfAboveMainDiagonal);
        int sumHalfUnderneathMainDiagonal = NumberUtils.sumHalfUnderneathMainDiagonal(a);
        System.out.format("Tổng các phần tử Nửa dưới đường chéo chính: %d\n", sumHalfUnderneathMainDiagonal);

        System.out.println("Bài 4d");
        int sumHalfAboveAuxiliaryDiagonal = NumberUtils.sumHalfAboveAuxiliaryDiagonal(a);
        System.out.format("Tổng các phần tử Nửa trên đường chéo phụ: %d\n", sumHalfAboveAuxiliaryDiagonal);
        int sumHalfUnderneathAuxiliaryDiagonal = NumberUtils.sumHalfUnderneathAuxiliaryDiagonal(a);
        System.out.format("Tổng các phần tử Nửa dưới đường chéo phụ: %d\n", sumHalfUnderneathAuxiliaryDiagonal);

    }

}
