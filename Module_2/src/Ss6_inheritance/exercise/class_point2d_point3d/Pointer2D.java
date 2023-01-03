package Ss6_inheritance.exercise.class_point2d_point3d;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Pointer2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public Pointer2D() {

    }
    public Pointer2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public  float getY() {
        return y;
    }
    public void setX( float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public  void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        return new float[] {getX(),getY()};
    }
    @Override
    public String toString() {
        return "(x, y) = " + Arrays.toString(getXY());
    }
}
