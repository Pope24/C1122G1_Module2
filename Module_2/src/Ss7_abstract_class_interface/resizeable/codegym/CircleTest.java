package Ss7_abstract_class_interface.resizeable.codegym;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        System.out.println("Area persent is: " + circle.getArea());
        circle.resize(50);
        System.out.println("Area now is "+circle.getArea());
    }
}