import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a = ");
        double a = sc.nextInt();
        System.out.println("nhap b = ");
        double b = sc.nextInt();
        if (a == 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (b == 0) {
            System.out.println("Phuong trinh co 1 nghiem duy nhat a = 0");
        }
        else {
            double result = -b/a;
            System.out.println("Ket qua cua phuong trinh la " +result);
        }
    }
}