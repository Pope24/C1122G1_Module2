package Ss6_inheritance.exercise.class_point_and_moveablePoint;

import java.util.Arrays;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point() {

    }
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return this.x;
    }
    public void setX(float newX) {
        this.x = newX;
    }
    public float getY() {
        return this.y;
    }
    public void setY(float newY) {
        this.y = newY;
    }
    public float[] getXY() {
        return new float[] {x, y};
    }
    public void setXY(float newX, float newY) {
        this.x = newX;
        this.y = newY;
    }
    public String toString() {
        return  " x = "
                + getX()
                + " y = "
                + getY()
                + " and coordinate is "
                + Arrays.toString(getXY());
    }
}
