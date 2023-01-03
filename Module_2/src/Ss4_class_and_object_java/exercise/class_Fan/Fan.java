package Ss4_class_and_object_java.exercise.class_Fan;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM  = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public Fan() {

    }
    public Fan(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.on = status;
        this.radius = radius;
        this.color = color;
    }
    public String toString() {
        if (this.on == true) {
            return "Speed = " + this.speed + "|" +" Radius = " + this.radius + "|" +" Color = " + this.color + "| Fan is on";
        }
        else {
            return "Radius = " + this.radius + "|" +" Color = " + this.color + "| Fan is off";
        }
    }
    boolean getStatus() {
        return this.on;
    }
    void setStatus(boolean status) {
        this.on = status;
    }
}

