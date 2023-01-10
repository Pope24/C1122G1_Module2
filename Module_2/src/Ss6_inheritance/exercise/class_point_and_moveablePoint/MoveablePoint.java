package Ss6_inheritance.exercise.class_point_and_moveablePoint;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {

    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(float newXSpeed) {
        this.xSpeed = newXSpeed;
    }

    public void setYSpeed(float newYSpeed) {
        this.ySpeed = newYSpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    public void setSpeed(float newXSpeed, float newYSpeed) {
        this.xSpeed = newXSpeed;
        this.ySpeed = newYSpeed;
    }

    public float[] move() {
        float newX = super.getX() + this.xSpeed;
        float newY = super.getY() + this.ySpeed;
        return new float[]{newX, newY};
    }

    public String toString() {
        return " xSpeed = "
                + getXSpeed()
                + " ySpeed = "
                + getYSpeed()
                + " and coordinate of (xSpeed, ySpeed) = "
                + Arrays.toString(getSpeed())
                + "and coordinate after moved = "
                + Arrays.toString(move())
                + " and this is subClass of "
                + super.toString();
    }
}
