package Demo;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        //int[][] a = inputMatrix();
        int[][] a = generateMatrix(5, 8, 0, 50);
        printMatrix(a);

        int sum = sumElements(a);
        System.out.format("SUM: %d", sum);
    }

    public static int[][] inputMatrix() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Số dòng: ");
        int r = scanner.nextInt();

        System.out.print("Số cột: ");
        int c = scanner.nextInt();

        int[][] ret = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.format("a[%d,%d]:", i, j);
                ret[i][j] = scanner.nextInt();
            }
        }
        return ret;
    }

    public static void printMatrix(int[][] a) {
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                System.out.format("%5d ", a[i][j]);
            }
            System.out.println("");
        }
    }

    public static int[][] generateMatrix(int r, int c, int min, int max) {
        int[][] ret = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ret[i][j] = (int) Math.floor((Math.random() * (max - min)) + min);
            }
        }

        return ret;
    }

    public static int sumElements(int[][] a) {
        int s = 0;
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                s += a[i][j];
            }
        }
        return s;
    }
}
