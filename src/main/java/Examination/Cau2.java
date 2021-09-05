package Examination;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Cau2 {
    public static void main(String[] args) {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$)";
        String password;
        System.out.print("Nhập mật khẩu: ");
        password = new Scanner(System.in).next();
        if (password.length() < 10) {
            System.out.println("Mật khẩu yếu");
        } else if (Pattern.matches(pattern, password)) {
            System.out.println("Mật khẩu mạnh");
        } else {
            System.out.println("Mật khẩu chưa đủ mạnh");
        }
    }
}

