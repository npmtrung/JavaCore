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
        if (x > 0)
            return;

        this.x = x;
    }

    public void setY(int y) {
        if (y > 0)
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

    public double distance(Diem another) {
        double dx = another.x - this.x;
        double dy = another.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

}
