package Excercises.entities;

import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien {
    private String coQuan;

    public GiangVienThinhGiang() {
    }

    public GiangVienThinhGiang(String ten, String email, String diaChi, String soDT, int soGioDay, String coQuan) {
        super(ten, email, diaChi, soDT, soGioDay);
        this.coQuan = coQuan;
    }

    @Override
    public void fromConsole(Scanner sc) {
        super.fromConsole(sc);

        System.out.print("- Cơ quan: ");
        this.coQuan = sc.nextLine();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GiangVienThinhGiang {");
        this.getGVString(sb);
        sb.append(", coQuan='").append(coQuan).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int tinhLuong() {
        final int luong1Gio = 200000;
        return this.soGioDay * luong1Gio;
    }
}
