import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class Excercise_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //bai1
        System.out.println("Bài 1");
        System.out.print("Nhập số: ");
        int inputNumber = scanner.nextInt();
        String[] word = {"Một","Hai","Ba","Bốn","Năm","Sáu","Bảy","Tám","Chín"};
        if (inputNumber >= 1 && inputNumber <= 9) {
            System.out.println("Số nhập vào là: " + word[inputNumber - 1]);
        }
        else {
            System.out.println("Không đọc được");
        }

        //bai2
        System.out.println("Bài 2");
        char temp1,temp2;
        System.out.print("Nhập một chữ cái: ");
        Character a2 = scanner.next().charAt(0);
        if(Character.isLowerCase(a2)) {
            temp1 = Character.toUpperCase(a2);
            System.out.println(temp1);
        } else {
            temp2 = Character.toLowerCase(a2);
            System.out.println(temp2);
        }

        //bai3
        System.out.println("Bài 3");
        System.out.print("Nhập giá trị a của phương trình bậc một: ");
        int a3 = scanner.nextInt();
        System.out.print("Nhập giá trị b của phương trình bậc một: ");
        int b3 = scanner.nextInt();
        Double x;
        if (a3 == 0) {
            if (b3 == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            x = (double)-b3 / a3;
            System.out.println(x);
        }

        //bai4
        System.out.println("Bài 4");
        System.out.print("Nhập giá trị a của phương trình bậc hai: ");
        int a4 = scanner.nextInt();
        System.out.print("Nhập giá trị b của phương trình bậc hai: ");
        int b4 = scanner.nextInt();
        System.out.print("Nhập giá trị c của phương trình bậc hai: ");
        int c4 = scanner.nextInt();
        Float x1, x2;
        float delta = b4 * b4 - 4 * a4 * c4;
        if (delta > 0) {
            float deltaSqrt = (float) Math.sqrt(delta);
            x1 = (-b4 + deltaSqrt) / (2.0f * a4);
            x2 = (-b4 - deltaSqrt) / (2.0f * a4);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } else if (delta == 0) {
            x1 = x2 = -b4 / (2.0f * a4);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } else if (delta < 0) {
            x1 = x2 = null;
            System.out.println("Phương trình vô nghiệm");
        }

        //bai5
        System.out.println("Bài 5");
        System.out.print("Nhập số nguyên a: ");
        int a5 = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b5 = scanner.nextInt();
        System.out.print("Nhập số nguyên c: ");
        int c5 = scanner.nextInt();
        System.out.print("Nhập số nguyên d: ");
        int d5 = scanner.nextInt();
        int numbers[]= new int[]{a5,b5,c5,d5};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("Số nhỏ nhất là: "+ min);

        //bai6
        System.out.println("Bài 6");
        System.out.print("Nhập số nguyên a: ");
        int a6 = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b6 = scanner.nextInt();
        System.out.print("Nhập số nguyên c: ");
        int c6 = scanner.nextInt();
        System.out.print("Nhập số nguyên d: ");
        int d6 = scanner.nextInt();
        int[] arrangeNumbers = new int[]{a6, b6, c6, d6};
        int temp = 0;
        System.out.println("Dãy số ban đầu: ");
        for (int i = 0; i < arrangeNumbers.length; i++) {
            System.out.println(arrangeNumbers[i] + " ");
        }
        for (int i = 0; i < arrangeNumbers.length; i++) {
            for (int j = i + 1; j < arrangeNumbers.length; j++) {
                if (arrangeNumbers[i] > arrangeNumbers[j]) {
                    temp = arrangeNumbers[i];
                    arrangeNumbers[i] = arrangeNumbers[j];
                    arrangeNumbers[j] = temp;
                }
            }
        }
       System.out.println("Dãy số sắp xếp tăng dần: ");
        for (int i = 0; i < arrangeNumbers.length; i++) {
            System.out.println(arrangeNumbers[i] + " ");
        }

        //bai7
        System.out.println("Bài 7");
        final int startingFee = 15000;
        final int next4Km = 13500;
        final int above6Km = 11000;
        double money = 0;
        System.out.print("Nhập vào số km đã đi: ");
        double km = scanner.nextDouble();
        if (km <= 0){
            System.out.println("Số km phải lớn hơn 0");
        } else if (km <= 1){
            System.out.println("Số tiền: " + startingFee);
        } else if (km > 1 && km <= 5){
            money = (double)startingFee + ((km-1) * next4Km);
            System.out.println("Số tiền: " + money);
        } else if (km > 5){
            money = (double)startingFee + (4 * next4Km) + ((km-5) * above6Km);
            System.out.println("Số tiền: " + money);
        } else if (km >= 120){
            money = (double)(startingFee + (4 * next4Km) + ((km-5) * above6Km))*(90/100);
            System.out.println("Số tiền: " + money);
        }

        //bai8
        System.out.println("Bài 8");
        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " năm " + year + " có 31 ngày.");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + " năm " + year + " có 30 ngày.");
            break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Tháng " + month + " năm " + year + " có 29 ngày.");
                } else {
                    System.out.println("Tháng " + month + " năm " + year + " có 28 ngày.");
                }
            break;
            default:
                System.out.println("Tháng không hợp lệ.");
        }

        System.out.println("Bài 9");
        System.out.print("Nhập độ dài 3 cạnh của tam giác: ");
        int a9 = scanner.nextInt();
        int b9 = scanner.nextInt();
        int c9 = scanner.nextInt();
        if (a9 <= 0 || b9 <= 0 || c9 <= 0){
            System.out.println("Độ dài cạnh tam giác không hợp lệ");
        } else if ((a9 == b9) && (b9 == c9) && (c9 == a9)) {
            System.out.println("Đây là tam giác đều");
        } else if  ((a9 == b9) || (b9 == c9) || (c9 == a9)) {
            System.out.println("Đây là tam giác cân");
        } else if ((a9 * a9 == b9 * b9 + c9 * c9) || (b9 * b9 == a9 * a9 + c9 * c9) || (c9 * c9 == b9 * b9 + a9 * a9)) {
            System.out.println("Đây là tam giác vuông");
        } else if ((a9 + b9 > c9) || (a9 + c9 > b9) || (b9 + c9 > a9)) {
            System.out.println("Đây là tam giác");
        } else {
            System.out.println("Đây không phải tam giác");
        }
    }
};