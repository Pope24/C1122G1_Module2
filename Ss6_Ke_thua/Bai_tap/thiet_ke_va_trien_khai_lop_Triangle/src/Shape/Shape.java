package Shape;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean getFilled() {
        return this.filled;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + this.color + " and " + (isFilled() ? " filled" : " not filled");
    }
}
