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
        if(reversed == original) {
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

//    int n1;
//    n = new Scanner.
}



