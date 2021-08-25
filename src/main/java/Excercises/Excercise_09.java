package Excercises;

public class Excercise_09 {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(3, 4);
        PhanSo ps2 = new PhanSo(5, 10);
        System.out.print("Phân số 1: ");
        ps1.inPhanSo();
        System.out.format(" | Phân số 2: ");
        ps2.inPhanSo();
        System.out.format("\n----------");

        System.out.print("\nHai phân số sau rút gọn: ");
        System.out.println();
        ps1.rutGonPhanSo().inPhanSo();
        System.out.println();
        ps2.rutGonPhanSo().inPhanSo();
        System.out.format("\n----------");

        System.out.print("\nTổng hai phân số: ");
        PhanSo psCong = ps1.congPhanSo(ps2).rutGonPhanSo();
        psCong.inPhanSo();

        System.out.print("\nHiệu hai phân số: ");
        PhanSo psHieu = ps1.truPhanSo(ps2).rutGonPhanSo();
        psHieu.inPhanSo();

        System.out.print("\nTích hai phân số: ");
        PhanSo psTich = ps1.nhanPhanSo(ps2);
        psTich.inPhanSo();

        System.out.print("\nThương hai phân số: ");
        PhanSo psThuong = ps1.chiaPhanSo(ps2).rutGonPhanSo();
        psThuong.inPhanSo();
        System.out.format("\n----------");

        if (ps1.kiemTraPSToiGian()) {
            System.out.println();
            ps1.inPhanSo();
            System.out.print(" là phân số đã tối giản");
        } else {
            System.out.println();
            ps1.inPhanSo();
            System.out.format(" là phân số chưa tối giản");
        }
        if (ps2.kiemTraPSToiGian()) {
            System.out.println();
            ps2.inPhanSo();
            System.out.print(" là phân số đã tối giản");
        } else {
            System.out.println();
            ps2.inPhanSo();
            System.out.print(" là phân số chưa tối giản");
        }
        System.out.format("\n----------");

        if (ps1.kiemTraPhanSoAm()) {
            System.out.println();
            ps1.inPhanSo();
            System.out.print(" là phân số ÂM");
        } else {
            System.out.println();
            ps1.inPhanSo();
            System.out.print(" là phân số DƯƠNG");
        }
        if (ps2.kiemTraPhanSoAm()) {
            System.out.println();
            ps2.inPhanSo();
            System.out.print(" là phân số ÂM");
        } else {
            System.out.println();
            ps2.inPhanSo();
            System.out.print(" là phân số DƯƠNG");
        }
        System.out.format("\n----------\n");

        ps1.soSanhPhanSo(ps2);

    }
}
