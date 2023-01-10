package Ss6_inheritance.exercise.class_circle_and_class_cylinder;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "A radius is "
                + getRadius()
                + " a color is "
                + getColor()
                + " area is "
                + getArea()
                + " perimeter is " + getPerimeter();
    }
}

