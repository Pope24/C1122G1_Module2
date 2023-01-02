package thuc_hanh.interface_comparable;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3);
        circles[1] = new ComparableCircle(5.2, "red", true);
        circles[2] = new ComparableCircle(2.8, "blue", false);
        for (ComparableCircle circle: circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("Sau khi sap xep la: ");
        for (ComparableCircle circle: circles) {
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();

        Arrays.sort(circles ,circleComparator);
    }
}
