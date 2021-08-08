import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //bai1
        System.out.println("Bài 1");
        System.out.print("Nhập năm: ");
        int year1 = scanner.nextInt();
        if (year1 < 0){
            System.out.println("Năm không hợp lệ");
        } else if ((year1 >= 0 && year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0)) {
            System.out.println("Năm " + year1 + " là năm nhuận");
        } else {
            System.out.println("Năm " +  year1 + " không phải là năm nhuận");
        }

        //bai2
        System.out.println("Bài 2");
        System.out.print("Nhập năm: ");
        int day2 = scanner.nextInt();
        System.out.print("Nhập tháng: ");
        int month2 = scanner.nextInt();
        System.out.print("Nhập ngày: ");
        int year2 = scanner.nextInt();
        if (day2 < 1 || day2 > 31 || month2 < 1 || month2 > 12 || year2 < 0){
            System.out.println("Ngày không hợp lệ");
        } else if ((year2 >= 0 && year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0) && (month2 >= 1 || month2 <= 12) && (day2 >= 1 || day2 <= 29)){
            System.out.println("Ngày hợp lệ");
        } else if ((year2 >= 0 && year2 % 4 != 0 && year2 % 100 == 0) || (year2 % 400 == 0) && (month2 >= 1 || month2 <= 12) && (day2 >= 1 || day2 <= 28)){
            System.out.println("Ngày hợp lệ");
        } else if ((month2 >= 1 || month2 <= 12) && (day2 >= 1 || day2 <= 31)){
            System.out.println("Ngày hợp lệ");
        }
    }
}
