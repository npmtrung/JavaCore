package Examination.Cau4;

import java.util.Scanner;

public class Passenger {
    private String hoTen, gioiTinh;
    private int tuoi;
    private Ticket[] danhSachVe;

    public Passenger() {
    }

    public Passenger(String hoTen, String gioiTinh, int tuoi, Ticket[] danhSachVe) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.danhSachVe = danhSachVe;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public String getGioiTinh() {
        return this.gioiTinh;
    }

    public int getTuoi() {
        return this.tuoi;
    }

    public Ticket[] danhSachVe() {
        return this.danhSachVe;
    }

    public void setDanhSachVe(Ticket[] danhSachVe) {
        this.danhSachVe = danhSachVe;
    }

    public void nhapThongTinHanhKhach() {
        System.out.print("Nhập tên hành khách: ");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.print("Nhập giới tính: ");
        this.gioiTinh = new Scanner(System.in).nextLine();
        System.out.print("Nhập tuổi: ");
        this.tuoi = new Scanner(System.in).nextInt();
        System.out.print("Nhập số lượng vé: ");
        int soLuongVe = new Scanner(System.in).nextInt();
        Ticket[] danhSachVe = new Ticket[soLuongVe];
        if (soLuongVe > 0) {
            for (int i = 0; i < soLuongVe; i++) {
                System.out.println("Vé thứ " + (i + 1));
                danhSachVe[i] = new Ticket();
                danhSachVe[i].nhapThongTinChuyenBay();
            }
        }
        this.danhSachVe = danhSachVe;
    }

    public String xuatThongTinHanhKhach() {
        String thongTinHanhKhach = "";
        thongTinHanhKhach += "Tên hành khách: " + this.hoTen + "\nGiới tính: " + this.gioiTinh + "\nTuổi: " + this.tuoi + "\n----- Danh sách vé -----\n";
        for (int i = 0; i < this.danhSachVe.length; i++) {
            thongTinHanhKhach += (i + 1) + " - " + this.danhSachVe[i].xuatThongTinVe();
        }
        return thongTinHanhKhach;
    }

    public int tongGiaVe() {
        int tongGiaVe = 0;
        for (int i = 0; i < this.danhSachVe.length; i++) {
            tongGiaVe = tongGiaVe + this.danhSachVe[i].getGiaVe();
        }
        return tongGiaVe;
    }

    public static Passenger[] nhapDSHanhKhach(int n) {
        Passenger[] dsHanhKhach = new Passenger[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Hành khách " + (i + 1));
            dsHanhKhach[i] = new Passenger();
            dsHanhKhach[i].nhapThongTinHanhKhach();
        }
        return dsHanhKhach;
    }

    public static void xuatDSHanhKhach(Passenger[] dsHanhKhach) {
        for (int i = 0; i < dsHanhKhach.length; i++) {
            System.out.println(dsHanhKhach[i].xuatThongTinHanhKhach());
            System.out.println("Tổng giá vé: " + dsHanhKhach[i].tongGiaVe());
            System.out.println();
        }
    }

    public static void sapXepGiaVeGiamDan(Passenger[] dsHanhKhach) {
        for (int i = 0; i < dsHanhKhach.length - 1; i++) {
            for (int j = i + 1; j < dsHanhKhach.length; j++) {
                if (dsHanhKhach[j].tongGiaVe() > dsHanhKhach[i].tongGiaVe()) {
                    Passenger tmp = dsHanhKhach[i];
                    dsHanhKhach[i] = dsHanhKhach[j];
                    dsHanhKhach[j] = tmp;
                }
            }
        }

        for (int i = 0; i < dsHanhKhach.length; i++) {
            System.out.println("Hành khách " + (i + 1));
            System.out.println(dsHanhKhach[i].xuatThongTinHanhKhach());
        }
    }

}

