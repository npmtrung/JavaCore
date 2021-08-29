package Excercises.entities;

public class Diem {
    private int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        if (x < -10 || x > 10)
            return;

        this.x = x;
    }

    public void setY(int y) {
        if (y < -10 || y > 10)
            return;

        this.y = y;
    }

    public Diem() {
        this.x = 0;
        this.y = 0;
    }

    public Diem(int px, int py) {
        this.x = px;
        this.y = py;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Diem {");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }

    public static Diem parseFromString(String str) {
        String[] parts = str.split(",");
        Diem ret = new Diem();
        ret.x = Integer.parseInt(parts[0]);
        ret.y = Integer.parseInt(parts[1]);
        return ret;
    }

    public static Diem generate() {
        final int max = 10;
        final int min = -10;
        int x = (int) Math.floor(Math.random() * (max - min)) + min;
        int y = (int) Math.floor(Math.random() * (max - min)) + min;
        return new Diem(x, y);
    }

    public double distance(Diem another) {
        double dx = another.x - this.x;
        double dy = another.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Diem findCentralSymmetry() {
        Diem ret = new Diem();
        ret.x = -this.x;
        ret.y = -this.y;
        return ret;
    }

    public Diem findXAxisSymmetry() {
        Diem ret = new Diem();
        ret.x = this.x;
        ret.y = -this.y;
        return ret;
    }

    public Diem findYAxisSymmetry() {
        Diem ret = new Diem();
        ret.x = -this.x;
        ret.y = this.y;
        return ret;
    }

    public int detectQuadrant() {
        if (this.x >= 0 && this.y >= 0) return 1;
        if (this.x <= 0 && this.y >= 0) return 2;
        if (this.x <= 0 && this.y <= 0) return 3;
        return 4;
    }
}
