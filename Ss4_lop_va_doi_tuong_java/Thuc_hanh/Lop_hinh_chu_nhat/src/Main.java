import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu rong = ");
        double width = sc.nextDouble();
        System.out.println("Nhap chieu doc = ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Dien tich cua hinh chu nhat la " + rectangle.printArea());
        System.out.println("Chu vi cua hinh chu nhat la " + rectangle.printPerimeter());
        System.out.println(rectangle.printWidthAndHeight());

    }
}