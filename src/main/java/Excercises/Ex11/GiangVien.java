package Excercises.Ex11;

import java.util.Scanner;

public class GiangVien {
    protected String tenGV;
    protected String email;
    protected String diaChi;
    protected String soDT;
    protected int soGioDay;

    public GiangVien() {
    }

    public GiangVien(String tenGV, String email, String diaChi, String soDT, int soGioDay) {
        this.tenGV = tenGV;
        this.email = email;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.soGioDay = soGioDay;
    }

    public void fromConsole(Scanner sc) {
        System.out.print("- Tên: ");
        this.tenGV = sc.nextLine();

        System.out.print("- Email: ");
        this.email = sc.nextLine();

        System.out.print("- Điện thoại: ");
        this.soDT = sc.nextLine();

        System.out.print("- Địa chỉ: ");
        this.diaChi = sc.nextLine();

        System.out.print("- Số giờ dạy trong tháng: ");
        this.soGioDay = Integer.parseInt(sc.nextLine());
    }

    public String getTenGV() {
        return tenGV;
    }

    public String getEmail() {
        return email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public int getSoGioDay() {
        return soGioDay;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GiangVien {");
        this.getGVString(sb);
        sb.append('}');
        return sb.toString();
    }

    protected void getGVString(StringBuffer sb) {
        sb.append("ten='").append(tenGV).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", diaChi='").append(diaChi).append('\'');
        sb.append(", dienThoai='").append(soDT).append('\'');
        sb.append(", soGioDay=").append(soGioDay);
    }

    public int tinhLuong() {
        return 0;
    }
}


