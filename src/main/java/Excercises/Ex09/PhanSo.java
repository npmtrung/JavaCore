package Excercises.Ex09;

public class PhanSo {

    private int tuSo, mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public static PhanSo parseFromString(String str) {
        String[] parts = str.split("/");

        PhanSo ps = new PhanSo();
        ps.tuSo = Integer.parseInt(parts[0]);
        ps.mauSo = Integer.parseInt(parts[1]);
        return ps;
    }

    public PhanSo() {
    }

    public void inPhanSo() {
        if (tuSo == mauSo) {
            System.out.println(1);
        } else {
            System.out.format("%d/%d", tuSo, mauSo);
        }
    }

    public int UCLN(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return UCLN(b, a % b);
        }
    }

    public boolean kiemTraPSToiGian() {
        PhanSo ps = new PhanSo(this.tuSo, this.mauSo);
        for (int i = 2; i <= ps.tuSo && i <= ps.mauSo; i++) {
            if (ps.tuSo == ps.mauSo) {
                return true;
            } else if ((ps.tuSo % i == 0) && (ps.mauSo % i == 0)) {
                return false;
            }
        }
        return true;
    }

    public PhanSo rutGonPhanSo() {
        PhanSo phanSoRutGon = new PhanSo();
        int ucln = UCLN(this.tuSo, this.mauSo);
        phanSoRutGon.tuSo = this.tuSo / ucln;
        phanSoRutGon.mauSo = this.mauSo / ucln;
        return phanSoRutGon;
    }

    public PhanSo congPhanSo(PhanSo ps2) {
        PhanSo ps1 = new PhanSo();
        if (this.mauSo == ps2.mauSo) {
            ps1.tuSo = this.tuSo + ps2.tuSo;
            ps1.mauSo = ps2.mauSo;
        } else {
            ps1.tuSo = (this.tuSo * ps2.mauSo) + (ps2.tuSo * this.mauSo);
            ps1.mauSo = this.mauSo * ps2.mauSo;
        }
        return ps1;
    }

    public PhanSo truPhanSo(PhanSo ps2) {
        PhanSo ps1 = new PhanSo();
        if (this.mauSo == ps2.mauSo) {
            ps1.tuSo = this.tuSo - ps2.tuSo;
            ps1.mauSo = ps2.mauSo;
        } else {
            ps1.tuSo = (this.tuSo * ps2.mauSo) - (ps2.tuSo * this.mauSo);
            ps1.mauSo = this.mauSo * ps2.mauSo;
        }
        return ps1;
    }

    public PhanSo nhanPhanSo(PhanSo ps) {
        PhanSo ps1 = new PhanSo();
        ps1.tuSo = this.tuSo * ps.tuSo;
        ps1.mauSo = this.mauSo * ps.mauSo;
        return ps1;
    }

    public PhanSo chiaPhanSo(PhanSo ps) {
        PhanSo ps1 = new PhanSo();
        ps1.tuSo = this.tuSo * ps.mauSo;
        ps1.mauSo = this.mauSo * ps.tuSo;
        return ps1;
    }

    public boolean kiemTraPhanSoAm() {
        if (this.tuSo > 0 && this.mauSo > 0) {
            return false;
        }
        return true;
    }

    public void soSanhPhanSo(PhanSo ps) {
        PhanSo tempPS = new PhanSo(this.tuSo, this.mauSo);
        tempPS = tempPS.truPhanSo(ps);
        if (tempPS.kiemTraPhanSoAm()) {
            System.out.format("Phân số %d/%d NHỎ hơn phân số %d/%d", this.tuSo, this.mauSo, ps.tuSo, ps.mauSo);
        } else if (!tempPS.kiemTraPhanSoAm()) {
            System.out.format("Phân số %d/%d LỚN hơn phân số %d/%d", this.tuSo, this.mauSo, ps.tuSo, ps.mauSo);
        } else {
            System.out.format("Hai phân số %d/%d và %d/%d BẰNG NHAU", this.tuSo, this.mauSo, ps.tuSo, ps.mauSo);
        }
    }
}
