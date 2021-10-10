package Excercises.Ex19;

public class Triangle {
    private Point d1, d2, d3;

//    public Triangle() {
//        this.d1 = Point.generate();
//        this.d2 = Point.generate();
//        this.d3 = Point.generate();
//    }

    public Triangle(Point d1, Point d2, Point d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TamGiac {\n");
        sb
                .append("  d1 = ").append("(").append(d1.getX()).append(", ").append(d1.getY()).append(")").append("\n")
                .append("  d2 = ").append("(").append(d2.getX()).append(", ").append(d2.getY()).append(")").append("\n")
                .append("  d3 = ").append("(").append(d3.getX()).append(", ").append(d3.getY()).append(")").append("\n")
                .append('}');
        return sb.toString();
    }

    public double calculatePerimeter() {
        double a = this.d1.distance(this.d2);
        double b = this.d1.distance(this.d3);
        double c = this.d2.distance(this.d3);
        return a + b + c;
    }

    public double calculateArea() {
        double a = this.d1.distance(this.d2);
        double b = this.d1.distance(this.d3);
        double c = this.d2.distance(this.d3);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
