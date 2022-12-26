public class Square extends Rectangle{
    public Square() {
    }
    public Square(double side) {
        super(side, side);
    }
    public double getSide() {
        return super.getWidth();
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double width) {
        setWidth(width);
    }
    @Override
    public void setLength(double length) {
        setWidth(length);
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + " Area is "
                + getArea()
                + " perimeter is "
                + getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }
}
