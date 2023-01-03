package Ss4_class_and_object_java.exercise.class_StopWatch;

import java.util.Scanner;

public class StopWatchTest {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap \"start\" to begin count milisecond !!");
        String startTime = sc.nextLine();

        if (startTime.equals("start")) {
            System.out.println("Start time is " + stopWatch.start());
            System.out.println("Nhap \"stop\" to stop count milisecond !!");
            String stopTime = sc.nextLine();

            if (stopTime.equals("stop")) {
                System.out.println("End time is " + stopWatch.stop());
                System.out.println(stopWatch.getter());
                System.out.println("Time has counted: " + stopWatch.getElapsedTime());
            }
        }
        else {
            System.out.println("Phai go dung\"start\" no moi dem nhe !!");
        }
    }
}
