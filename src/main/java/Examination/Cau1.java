package Examination;

import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        /* Đếm số từ viết hoa trong chuỗi */
        String s1 = "You Only Live Once. But if You do it right. once is Enough";
        checkUppercaseChar(s1);

        /* Viết in hoa toàn bộ chữ đầu của các từ trong chuỗi đó */
        UppercaseWords(s1);

        /* Chuyển ký tự đầu tiên của chuỗi hoặc ký tự đầu tiên của từ sau dấu chấm là viết in hoa, các chữ con lại viết thường */
        System.out.printf(upperCaseFirstWords(s1));
    }

    public static void checkUppercaseChar(String s1) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (Character.isUpperCase(s1.charAt(i))) {
                count++;
            }
        }
        System.out.println("Số lượng ký tự in hoa trong chuỗi là " + count);
    }

    public static void UppercaseWords(String s1) {
        char[] charArray = s1.toCharArray();
        boolean findSpace = true;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                if (findSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    findSpace = false;
                }
            } else {
                findSpace = true;
            }
        }
        s1 = String.valueOf(charArray);
        System.out.println(s1);
    }

    public static String upperCaseFirstWords(String s1) {
        String[] words = s1.split("\\. ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String firstLetter = words[i].substring(0, 1).toUpperCase();
            String remainingLetters = words[i].substring(1).toLowerCase();
            result += firstLetter + remainingLetters + ". ";
        }
        return result;
    }
}
