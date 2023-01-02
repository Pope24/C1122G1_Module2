package bai_tap.colorable.codegym;

public class Square extends Shape implements Colorable{
    private double width = 1;
    public Square() {
    }
    public Square(double width) {
        this.width = width;
    }

    public Square(double width, String color, boolean filled) {
        super(color, filled);
        this.width = width;
    }
    public double getWidth() {
        return this.width;
    }
    public double getArea() {
        return Math.pow(this.width, 2);
    }
    @Override
    public String toString() {
        return "A square with length="
                + getWidth()
                + " and area is "
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
