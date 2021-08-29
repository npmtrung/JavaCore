package Demo;

import Excercises.entities.NumberUtils;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String str = "Data Type";

        short s = 10;
        int i = 100;
        long l = 1000000000;
        long l2 = 100L;
        float f = 3.1f;
        double d = 5.7;
        char c = 'a';
        char c2 = '5';
        boolean t = true;
        boolean f1 = false;

        Integer a = 100;
        Integer b = 200;
        System.out.println("Số a là " + a + " Số b là " + b);
        swap(a, b);
        System.out.println("Số a swap sai là " + a + " Số b swap sai là " + b);

        SimpleSeason sse = SimpleSeason.AUTUMN;
        System.out.println(sse);


        System.out.println("n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i1 = 0; i1 < n; i1++) {
            System.out.format("a[%d] = ", i1);
        }

        int[] arr = generateArray(5, 10, 100);
        System.out.println(arr);

        System.out.format("Max = %d\n", NumberUtils.findMax(arr));
        System.out.format("Min = %d\n", NumberUtils.findMin(arr));

        int maxIdx = NumberUtils.findMaxIndex(arr);
        System.out.format("Max = %d, Index = %d\n", arr[maxIdx], maxIdx);

        int firstNegIdx = NumberUtils.findFirstNegativeIndex(arr);
        if (firstNegIdx >= 0) {
            System.out.format("First negative = %d, Index = %d", arr[firstNegIdx], firstNegIdx);
        } else System.out.println("Không có phần tử âm");

        int lastPosIdx = NumberUtils.findLastPositiveIndex(arr);
        if (lastPosIdx >= 0) {
            System.out.format("Last positive = %d, Index = %d", arr[lastPosIdx], lastPosIdx);
        } else System.out.println("Không có phần tử dương");

        int minPosIdx = NumberUtils.findMinPositiveIndex(arr);
        if (minPosIdx >= 0) {
            System.out.format("Min Positive = %d, Index = %d", arr[minPosIdx], minPosIdx);
        } else System.out.println("Không có phần tử dương");

        int maxNegIdx = NumberUtils.findMaxNegativeIndex(arr);
        if (maxNegIdx >= 0) {
            System.out.format("Max Neagative = %d, Index = %d", arr[maxNegIdx], maxNegIdx);
        } else System.out.println("Không có phần tử âm");

        String str1 = "Hello OneMount Group";

        String ps = "1/3";
        String[] parts = ps.split("/");
        System.out.println(parts.length);
        for (String p : parts){
            System.out.println(p);
        }
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
        System.out.println("Số a swap đúng là " + a + " Số b swap đúng là " + b);
    }

    public static int sumElements(int[] arr) {
        int ret = 0;
        for (int ele : arr) {
            ret += ele;
        }
        return ret;
    }

    public static int[] generateArray(int n, int min, int max) {
        int[] ret1 = new int[n];
        for (int i = 0; i < ret1.length; i++) {
            ret1[i] = (int) Math.floor(Math.random() * (max - min)) + min;
        }
        return ret1;
    }

}


