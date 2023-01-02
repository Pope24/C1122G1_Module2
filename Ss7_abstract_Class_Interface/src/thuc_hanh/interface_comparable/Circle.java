package thuc_hanh.interface_comparable;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private boolean filled = true;
    public static final double PI = Math.PI;
    public Circle() {

    }
    public Circle(double r) {
        this.radius = r;
    }public Circle(double r, String color, boolean filled) {
        this.radius = r;
        this.color = color;
        this.filled = filled;
    }
    public  double getArea() {
        return this.radius * this.radius * PI;
    }
    public double getRadius() {
        return this.radius;
    }
}
