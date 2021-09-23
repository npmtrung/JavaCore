package Excercises.Ex06;

import Excercises.entities.NumberUtils;

import java.util.Scanner;

public class Excercise_06_String {
    public static void main(String[] args) {
        //bài1
        System.out.println("Bài 1");
        System.out.print("Nhập chuỗi s: ");
        String s1 = new Scanner(System.in).next();
        NumberUtils.checkUppercaseChar(s1);

        //bài2
        System.out.println("Bài 2");
        System.out.print("Nhập chuỗi s: ");
        String s2 = new Scanner(System.in).next();
        NumberUtils.checkNonNumeric(s2);

        //bài3
        System.out.println("Bài 3");
        System.out.print("Nhập chuỗi s: ");
        String s3 = new Scanner(System.in).nextLine();
        System.out.print("Nhập chuỗi c: ");
        char c3 = new Scanner(System.in).next().charAt(0);
        int occurrences = NumberUtils.countCharInString(s3,c3);
        System.out.format("Số lần xuất hiện của ký tự %s trong chuỗi %s là %d lần\n",c3,s3,occurrences);

        //bài4
        System.out.println("Bài 4");
        System.out.print("Nhập chuỗi s: ");
        String s4 = new Scanner(System.in).nextLine();
        int numberOfWords = NumberUtils.countWordInString(s4);
        System.out.format("Số lượng các từ trong chuỗi: %d\n", numberOfWords);

        //bài7
        System.out.println("Bài 7");
        System.out.print("Nhập chuỗi s: ");
        String s7 = new Scanner(System.in).nextLine();
        NumberUtils.countConsonantVowel(s7);

    }
}