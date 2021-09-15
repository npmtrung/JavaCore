package Excercises.Ex12;
import java.util.Scanner;

public class Excercise_12_QLBDS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chọn hình dạng miếng đất(1 - đất hình chữ nhật, 2 - đất hình vuông, 3 - đất hình tròn, 4 - đất hình tam giác): ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                MiengDat chuNhat = new MiengDatHinhChuNhat();
                chuNhat.input();
                System.out.println(chuNhat.toString());
                break;
            case 2:
                MiengDat vuong = new MiengDatHinhVuong();
                vuong.input();
                System.out.println(vuong.toString());
                break;
            case 3:
                MiengDat tron = new MiengDatHinhTron();
                tron.input();
                System.out.println(tron.toString());
                break;
            case 4:
                MiengDat tamGiac = new MiengDatHinhTamGiac();
                tamGiac.input();
                System.out.println(tamGiac.toString());
                break;
            default:
                System.out.println("Bạn nhập không đúng. Mời nhập lại");
                break;
        }
    }
}
