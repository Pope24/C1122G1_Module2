public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public static final double PI = Math.PI;
    public Circle() {

    }
    public Circle(double r) {
        this.radius = r;
    }
    public  double getArea() {
        return this.radius * this.radius * PI;
    }
    public double getRadius() {
        return this.radius;
    }
}
