import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Ve hinh chu nhat
        System.out.println("VE HINH CHU NHAT.");
        System.out.print("Nhap chieu dai = ");
        int widthRec = sc.nextInt();
        System.out.print("Nhap chieu cao = ");
        int heightRec = sc.nextInt();
        for (int i = 0; i < heightRec; i++) {
            for (int j = 0; j < widthRec; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
//        Ve hinh tam giac vuong
        System.out.println("VE HINH TAM GIAC VUONG.");
        System.out.print("Nhap chieu cao cua hinh tam giac vuong = ");
        int heightTriangle = sc.nextInt();
        for (int i = 1; i <= heightTriangle; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
//        Ve hinh tam giac vuong nguoc
        System.out.println("VE HINH TAM GIAC VUONG NGUOC");
        System.out.print("Nhap chieu cao cua hinh tam giac vuong nguoc = ");
        int heightOppositeTriangle = sc.nextInt();
        for (int i = heightOppositeTriangle; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}