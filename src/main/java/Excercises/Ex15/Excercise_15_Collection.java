package Excercises.Ex15;

import java.util.ArrayList;
import java.util.Scanner;

public class Excercise_15_Collection {
    public static void main(String[] args) {
        ArrayList<PhanSo> list = new ArrayList<>(4);
        do {
            System.out.println("-------------------");
            System.out.println("1. Input ");
            System.out.println("2. Print list");
            System.out.println("3. Add new element");
            System.out.println("4. Delete elemnent at position");
            System.out.println("5. Update elemnent at position");
            System.out.println("6. Find biggest elemnent");
            System.out.println("7. Clear all elemnents");
            System.out.println("0. Quit");
            System.out.print("Your command: ");

            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    System.out.println("Nhập vào danh sách phân số a/b: ");
                    for (int i = 0; i < 3; i++) {
                        list.add(i, PhanSo.fromString());
                    }
                    break;
                case 2:
                    System.out.println(list);
                    break;
                case 3:
                    System.out.println("Thêm Phân Số: ");
                    list.add(PhanSo.fromString());
                    break;
                case 4:
                    System.out.println("Xóa phân số tại vị trí");
                    int n = scanner.nextInt();
                    list.remove(n - 1);
                    break;
                case 5:
                    System.out.println("Cập nhật phân số tại vị trí");
                    int m = scanner.nextInt();
                    list.set(m - 1, PhanSo.fromString());
                    break;

                case 6:
                    PhanSo max = list.get(0);
                    for (int i = 1; i < list.size() - 1; i++) {
                        if (max.compareTo(list.get(i)) < 0) {
                            max = list.get(i);
                        }
                        System.out.println("Phần tử lớn nhất là: " + max);
                    }
                    break;
                case 7:
                    list.clear();
                    break;
                default:
                    return;
            }
        } while (true);
    }
}
