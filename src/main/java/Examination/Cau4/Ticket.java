package Examination.Cau4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ticket {
    private String tenChuyen;
    private LocalDateTime ngayBay;
    private int giaVe;

    public Ticket() {
    }

    public String layTenChuyen() {
        return tenChuyen;
    }

    public LocalDateTime layNgayBay() {
        return ngayBay;
    }

    public int layGiaVe() {
        return giaVe;
    }

    public Ticket(String tenChuyen, LocalDateTime ngayBay, int giaVe) {
        this.tenChuyen = tenChuyen;
        this.ngayBay = ngayBay;
        this.giaVe = giaVe;
    }

    public Ticket nhapThongTinChuyenBay() {
        System.out.print("Nhập tên chuyến bay: ");
        this.tenChuyen = new Scanner(System.in).next();
        System.out.print("Nhập ngày bay (Định dạng dd-MM-yyyy hh:mm): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm");
        this.ngayBay = LocalDateTime.parse(new Scanner(System.in).next(), formatter);
        System.out.print("Nhập giá vé: ");
        this.giaVe = new Scanner(System.in).nextInt();
        return new Ticket(tenChuyen, ngayBay, giaVe);
    }

    public String xuatThongTinVe() {
        return "Thông tin chuyến bay: {" +
                "Tên chuyến: '" + tenChuyen + '\'' +
                ", ngày bay: " + ngayBay +
                ", giá vé: " + giaVe +
                '}';
    }


}