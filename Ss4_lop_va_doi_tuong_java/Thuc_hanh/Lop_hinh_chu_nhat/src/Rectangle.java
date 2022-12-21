public class Rectangle {
    double width;
    double height;
    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double printArea() {
        return this.width * this.height;
    }
    public double printPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String printWidthAndHeight() {
        return "Chieu dai la " + this.width + " va chieu rong la " + this.height;
    }
}
