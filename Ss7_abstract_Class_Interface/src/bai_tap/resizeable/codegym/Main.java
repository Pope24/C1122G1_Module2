package bai_tap.resizeable.codegym;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(2,4);
//      Before random number to change area
        for (Shape shape: shapes) {
            System.out.println(shape);
        }
//      Increase area base on random 1-100 number
        int range;
        for (Shape shape: shapes) {
            range = (int) (Math.random() * 100) + 1;
            if (shape instanceof Circle) {
                Circle circleShape = (Circle) shape;
                circleShape.resize(range);
                System.out.println(circleShape);
            }
            if (shape instanceof Rectangle) {
                Rectangle rectangleShape = (Rectangle) shape;
                rectangleShape.resize(range);
                System.out.println(rectangleShape);
            }
        }
    }
}
