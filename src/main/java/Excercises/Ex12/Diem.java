package Excercises.Ex12;

public class Diem {
    private int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // constructors
    public Diem() {
        this.x = x;
        this.y = y;
    }

    public Diem(int px, int py) {
        this.x = px;
        this.y = py;
    }

    // Nhập và parse tọa độ điểm từ string
    public static Diem parseFromString(String str) {
        String[] parts = str.split(",");
        Diem ret = new Diem();
        ret.x = Integer.parseInt(parts[0]);
        ret.y = Integer.parseInt(parts[1]);
        return ret;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }

    public double distance(Diem another) {
        double dx = another.x - this.x;
        double dy = another.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public static Diem generate() {
        final int max = 10;
        final int min = -10;
        int x = (int) Math.floor(Math.random() * (max - min)) + min;
        int y = (int) Math.floor(Math.random() * (max - min)) + min;
        return new Diem(x, y);
    }
}
