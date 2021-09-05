package Examination;

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        System.out.print("Nhập một số nguyên dương: ");
        int a = new Scanner(System.in).nextInt();
        if (checkValidMonth(a)) {
            System.out.printf("%d là một tháng trong năm\n", a);
            System.out.printf("Tháng %d có %d ngày\n", a, checkDayofMonth(a));
        } else {
            System.out.printf("%d không phải là một tháng trong năm\n", a);
        }
    }

    public static boolean checkValidMonth(int a) {
        return (a > 0 && a <= 12);
    }

    public static int checkDayofMonth(int a) {
        if (checkValidMonth(a)) {
            switch (a) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 30;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 31;
                case 2:
                    return 28;
            }
        }
        return 0;
    }
}
