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

    public String getTenChuyen() {
        return tenChuyen;
    }

    public LocalDateTime getNgayBay() {
        return ngayBay;
    }

    public int getGiaVe() {
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
        System.out.print("Nhập ngày bay (Định dạng dd/MM/yyyy HH:mm): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        this.ngayBay = LocalDateTime.parse(new Scanner(System.in).nextLine(), formatter);
        System.out.print("Nhập giá vé: ");
        this.giaVe = new Scanner(System.in).nextInt();
        return new Ticket(tenChuyen, ngayBay, giaVe);
    }

    public String xuatThongTinVe() {
        return "Tên chuyến bay: " + getTenChuyen() + "\tNgày bay: " + getNgayBay().toString() + "\tGiá vé: " + getGiaVe() + "\n";
    }

    public Ticket[] nhapDSVe() {
        System.out.print("Số lượng vé: ");
        int soLuongVe = new Scanner(System.in).nextInt();
        Ticket[] listTicket = new Ticket[soLuongVe];
        Ticket ve = new Ticket();
        for (int i = 0; i < listTicket.length; i++) {
            listTicket[i] = ve.nhapThongTinChuyenBay();
        }
        return listTicket;
    }

        public String xuatDSVe() {
        Ticket ve = new Ticket();
        String dsVe = " ";
        for (int i = 0; i < nhapDSVe().length; i++) {
            ve = nhapDSVe()[i];
            dsVe = dsVe + (i + 1) + ". " + ve.getTenChuyen() + " " +
                    ve.getNgayBay().toString() + " " + ve.getGiaVe() + "\n";
            System.out.println();
        }
        return dsVe;
    }

    public Double getTongGiaVe(Ticket[] DSVe) {
        Double tongGiaVe = 0D;
        for (int i = 0; i < DSVe.length; i++) {
            tongGiaVe += DSVe[i].getGiaVe();
        }
        return tongGiaVe;
    }

}