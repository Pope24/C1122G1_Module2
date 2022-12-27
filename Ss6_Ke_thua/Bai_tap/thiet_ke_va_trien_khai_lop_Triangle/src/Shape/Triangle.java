package Shape;

import java.util.Arrays;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public Triangle() {

    }
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double[] getAllSide() {
        return new double[] {side1, side2, side3};
    }
    public void setAllSide(double s1, double s2, double s3) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    public double getArea() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1)* (p - side2)* (p - side3));
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    @Override
    public String toString() {
        return "3 side is "
                + Arrays.toString(getAllSide())
                + " area is "
                + getArea()
                + "perimeter is"
                + getPerimeter()
                + " and that is "
                + super.toString();
    }
}
