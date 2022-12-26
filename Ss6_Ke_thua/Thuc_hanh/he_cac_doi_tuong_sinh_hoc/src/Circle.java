public class Circle extends Shape{
    private double radius = 1;
    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return radius  * 2 * Math.PI;
    }
    @Override
    public String toString() {
        return "A Circle with radius= "+this.radius
                + "Area is "
                + getArea()
                +" Perimeter is "
                + getPerimeter()
                +" , which is a subclass of " + super.toString();
    }
}
