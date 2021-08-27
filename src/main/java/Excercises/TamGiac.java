package Excercises;

import java.util.Scanner;

public class TamGiac {
    private int a;
    private int b;
    private int c;

    public void nhapCanhTamGiac() {
        System.out.print("Nhập chiều dài cạnh A: ");
        this.a = new Scanner(System.in).nextInt();
        System.out.print("Nhập chiều dài cạnh B: ");
        this.b = new Scanner(System.in).nextInt();
        System.out.print("Nhập chiều dài cạnh C: ");
        this.c = new Scanner(System.in).nextInt();
    }

    public boolean ktTamGiac() {
        if ((this.a + this.b > this.c) || (this.a + this.c > this.b) || (this.b + this.c > this.a)) {
            return true;
        }
        return false;
    }

    public void inTamGiac() {
        if (ktTamGiac()) {
            System.out.format("Tam giác có 3 cạnh tương ứng là %d - %d - %d)\n", this.a, this.b, this.c);
        } else {
            do {
                System.out.println("Không phải tam giác. Vui lòng nhập lại");
                nhapCanhTamGiac();
            }
            while (!ktTamGiac());
        }
    }

    public int chuViTamGiac() {
        if (ktTamGiac()) {
            return this.a + this.b + this.c;
        }
        return 0;
    }

    public double dientichTamGiac() {
        if (ktTamGiac()) {
            double p = (double) (this.a + this.b + this.c) / 2;
            return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
        }
        return 0;
    }
}

