package Excercises;

import java.security.PublicKey;

import java.util.Scanner;

public class NumberUtils {
    public static boolean isPrimeNumber(int n) {
        boolean ret = true;
        if (n <= 1) {
            ret = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    ret = false;
                    break;
                }
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

    public static boolean isAscendingArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1])
                return false;
        }
        return true;
    }

    public static int countDivisible(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 4 == 0) && (arr[i] % 5 != 0)) {
                count += 1;
            }
        }
        return count;
    }

    static int sumPrimeNumber(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNumber(arr[i])) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMaxIndex(int[] arr) {
        int idx = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[idx]) {
                idx = i;
            }
        }
        return idx;
    }

    public static int findFirstNegativeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1; //Không có phần tử âm
    }

    public static int findLastPositiveIndex(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) { //chạy ngược mảng i = arr.length - 1
            if (arr[i] > 0) {
                return i;
            }
        }
        return -1;
    }

    public static int findMinPositiveIndex(int[] arr) {
        int lastPosIdx = findLastPositiveIndex(arr);
        if (lastPosIdx < 0) {
            return -1;
        }
        int minPosIdx = lastPosIdx;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < arr[minPosIdx]) {
                minPosIdx = i;
            }
        }
        return minPosIdx;
    }

    public static int findMaxNegativeIndex(int[] arr) {
        int maxNegIdx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && (maxNegIdx == -1 || arr[i] > arr[maxNegIdx])) {
                maxNegIdx = i;
            }
        }
        return maxNegIdx;
    }

    public static void checkUppercaseChar(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            if (Character.isUpperCase(s1.charAt(i))) {
                System.out.format("Những kí tự in hoa trong chuỗi: %s\n", s1.charAt(i));
            }
        }
    }

    public static void checkNonNumeric(String s2) {
        for (int i = 0; i < s2.length(); i++) {
            if (Character.isLetter(s2.charAt(i))) {
                System.out.format("Những kí tự không phải số trong chuỗi: %s\n", s2.charAt(i));
            }
        }
    }

    public static int countCharInString(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                count++;
        }
        return count;
    }

    public static int countWordInString(String string) {
        int count = 0;
        String[] s = string.split(" +");
        return s.length;
    }

    public static void countConsonantVowel(String string) {
        int countVowel = 0;
        int countConsonant = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isDigit(string.charAt(i))) {
                continue;
            } else if (c == 'a' || c == 'o' || c == 'e' || c == 'u' || c == 'i' || c == 'A' || c == 'O' || c == 'E' || c == 'U' || c == 'I') {
                countVowel++;
            } else if ((c > 'a' && c <= 'z') || (c > 'A' && c <= 'Z')) {
                countConsonant++;
            }
        }
        System.out.format("Số lượng ký tự nguyên âm trong chuỗi %s là: %d\n", string, countVowel);
        System.out.format("Số lượng ký tự phụ âm trong chuỗi %s là: %d\n", string, countConsonant);
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

    public static int[][] generateMatrix(int r, int c, int min, int max) {
        int[][] ret = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ret[i][j] = (int) Math.floor((Math.random() * (max - min)) + min);
            }
        }

        return ret;
    }

    public static boolean findX(int[][] a, int x) {
        boolean result = false;
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (x == a[i][j]) {
                    result = true;
                    break;
                }
            }

        }
        return result;
    }

    public static boolean isPrimeNum(int n) {
        boolean ret = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ret = false;
                break;
            }
        }
        return ret;
    }

    public static boolean isPrimeMatrix(int[][] a) {
        boolean ret = true;
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {

                if (!isPrimeNum(a[i][j])) {
                    ret = false;
                    break;
                }

            }

        }

        return ret;
    }


    public static int findMax(int[][] a) {
        int max = a[0][0];
        for (int i = 0, r = a.length; i < r; i++) {
            for (int j = 0, c = a[0].length; j < c; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }

            }

        }

        return max;
    }
}



