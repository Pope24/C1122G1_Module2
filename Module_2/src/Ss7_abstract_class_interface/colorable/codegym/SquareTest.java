package Ss7_abstract_class_interface.colorable.codegym;

public class SquareTest {
    public static void main(String args[]) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(6, 4);
        shapes[2] = new Square(3, "Red", false);
        for (Shape shape : shapes) {
            System.out.println(shape );
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
        }
    }
}
