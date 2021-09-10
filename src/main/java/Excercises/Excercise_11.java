package Excercises;

import Excercises.entities.GiangVien;
import Excercises.entities.GiangVienCoHuu;
import Excercises.entities.GiangVienThinhGiang;

import java.util.Scanner;

public class Excercise_11 {
    public static void main(String[] args) {

        GiangVien[] list = {
                new GiangVienCoHuu("Vinh", "vinh@", "dcVinh", "0909111111", 45, 5000000, 40),
                new GiangVienCoHuu("Tuan", "tuan@", "dcTuan", "0909111111", 35, 4000000, 35),
                new GiangVienThinhGiang("Khoa", "khoa@", "dcKhoa", "0909111111", 45, "hcmus"),
        };

        for (GiangVien gv : list) {
            System.out.println(gv);
        }
    }
}
