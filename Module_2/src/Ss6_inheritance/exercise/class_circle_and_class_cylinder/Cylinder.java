package Ss6_inheritance.exercise.class_circle_and_class_cylinder;

public class Cylinder extends Circle {
    private double height = 1;
    public Cylinder() {

    }
    public Cylinder(double height) {
        this.height = height;
    }
    public double getVolume() {
        return super.getArea() * height;
    }
    @Override
    public String toString() {
        return "A radius is "
                + getRadius()
                + " a color is "
                + getColor()
                + " area is "
                + getArea()
                + " perimeter is "
                + getPerimeter()
                + " volume is "
                +getVolume()
                + " That is subclass of " + super.toString();
    }
}
