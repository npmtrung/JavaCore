package Excercises.Ex12;

public class MiengDat {
    protected int chieuDai, chieuRong, point, gia;

    public MiengDat() {
    }

    public MiengDat(int chieuDai, int chieuRong, int point) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.point = point;
    }

    public MiengDat(int chieuRong, int point) {
        this.chieuRong = chieuRong;
        this.point = point;
    }

    public MiengDat(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Thông tinh đất (");
        sb.append(')');
        return sb.toString();
    }

    public void input() {
    }

    public int giaDat(int gia1m) {
        return gia1m;
    }
}

