package Excercises;

import java.security.PublicKey;
import java.util.Scanner;

public class NumberUtils {
    public static boolean isPrimeNumber(int n) {
        boolean ret = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ret = false;
                break;
            }
        }
        return ret;
    }

    public static boolean isSymmetryNumber(int num1) {
        int reversed = 0;
        int original = num1;
        while (num1 != 0) {
            int digit = num1 % 10;
            reversed = reversed * 10 + digit;
            num1 /= 10;
        }
        if (reversed == original) {
            return true;
        } else {
            return false;
        }
    }

    public static int factorialCalc(int num3) {
        int factorial = 1;
        if (num3 == 0 || num3 == 1) {
            return factorial;
        } else {
            for (int i = 2; i <= num3; i++) {
                factorial = factorial * i;
            }
        }
        return factorial;
    }

    public static int sumFactorial(int num4) {
        int factorial = 1;
        int sumFactorial = 1;
        if (num4 == 0 || num4 == 1) {
            return factorial;
        } else {
            for (int i = 2; i <= num4; i++) {
                factorial = factorial * i;
                sumFactorial = sumFactorial + factorial;
            }
        }
        return sumFactorial;
    }

    public static int reverseNumber(int num5) {
        int reversed = 0;
        while (num5 > 0) {
            int digit = num5 % 10;
            reversed = reversed * 10 + digit;
            num5 /= 10;
        }
        return reversed;
    }

    public static int[] generateArray(int n, int min, int max) {
        int[] ret1 = new int[n];
        for (int i = 0; i < ret1.length; i++) {
            ret1[i] = (int) Math.floor(Math.random() * (max - min)) + min;
        }
        return ret1;
    }

    public static int sumElements(int[] arr) {
        int ret = 0;
        for (int ele : arr) {
            ret += ele;
        }
        return ret;
    }

    public static boolean isPrimeArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (!isPrimeNumber(arr[i]))
                return false;
        }
        return true;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%d ", arr[i]);
        }
        System.out.println();
    }

//    public static void sortArray(int[] array) {
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//            }
//            if (array[i] > array[j]) {
//                int temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
//            }
//        }
//    }

}



