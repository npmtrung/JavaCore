package Excercises.Ex10;

public class DonThuc {
    private int a;
    private int n;

    public DonThuc(int a, int n) {
        this.a = a;
        this.n = n;
    }

    public DonThuc() {
    }

    public void inDonThuc() {
        if (n == 0) {
            System.out.println(a);
        } else if (n == 1) {
            System.out.println(a + "x");
        } else if (a == 0) {
            System.out.println("x");
        } else {
            System.out.println(a + "x" + "^" + n);
        }
    }

    public DonThuc nhanDonThuc(DonThuc donThuc2) {
        DonThuc kq = new DonThuc();
        kq.a = this.a * donThuc2.a;
        kq.n = this.n * donThuc2.n;
        return kq;
    }

    public DonThuc chiaDonThuc(DonThuc donThuc3) {
        DonThuc kq = new DonThuc();
        kq.a = this.a / donThuc3.a;
        kq.n = this.n - donThuc3.n;
        return kq;
    }

    public void daoHamDonThuc() {
        this.a = (this.a) * (this.n);
        this.n = this.n - 1;
    }

    public int tinhDonThucx0(int x0) {
        return (int) (a * Math.pow(x0, this.n));
    }
}
