package Excercises.Ex19;

public class Point {
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

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int px, int py) {
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

    public static Point parseFromString(String str) {
        String[] parts = str.split(",");
        Point ret = new Point();
        ret.x = Integer.parseInt(parts[0]);
        ret.y = Integer.parseInt(parts[1]);
        return ret;
    }

//    public static Point generate() {
//        final int max = 10;
//        final int min = -10;
//        int x = (int) Math.floor(Math.random() * (max - min)) + min;
//        int y = (int) Math.floor(Math.random() * (max - min)) + min;
//        return new Point(x, y);
//    }

    public double distance(Point another) {
        double dx = another.x - this.x;
        double dy = another.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point findCentralSymmetry() {
        Point ret = new Point();
        ret.x = -this.x;
        ret.y = -this.y;
        return ret;
    }

    public Point findXAxisSymmetry() {
        Point ret = new Point();
        ret.x = this.x;
        ret.y = -this.y;
        return ret;
    }

    public Point findYAxisSymmetry() {
        Point ret = new Point();
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
