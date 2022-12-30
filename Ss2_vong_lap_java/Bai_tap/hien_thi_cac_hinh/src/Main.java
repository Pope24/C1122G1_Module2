import java.util.Scanner;

public class Main {
    public static void drawRectangle() {
        Scanner sc = new Scanner(System.in);
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
    }
    public static void drawTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("VE HINH TAM GIAC VUONG.");
        System.out.print("Nhap chieu cao cua hinh tam giac vuong = ");
        int heightTriangle = sc.nextInt();
        System.out.println("VE HINH TAM GIAC VUONG GOC DUOI TRAI");
        for (int i = 1; i <= heightTriangle; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("VE HINH TAM GIAC VUONG GOC TREN TRAI");
        for (int i = heightTriangle; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("VE HINH TAM GIAC VUONG GOC TREN PHAI");
        for (int i = heightTriangle; i >= 1; i--) {
            for (int k = i; k < heightTriangle; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("VE HINH TAM GIAC VUONG GOC DUOI PHAI");
        for (int i = heightTriangle; i >= 1; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = i; k <= heightTriangle; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void drawIsolatedTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("VE HINH TAM GIAC VUONG CAN.");
        System.out.print("Nhap chieu cao cua hinh tam giac vuong can = ");
        int heightIsolatedTriangle = sc.nextInt();
        System.out.println("VE HINH TAM GIAC VUONG GOC DUOI TRAI");
        for (int i = 1; i <= heightIsolatedTriangle; i++) {
            for (int j = heightIsolatedTriangle; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choose;
        do {

            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Nhap su lua chon cua ban = ");
            choose = sc.nextInt();
            switch(choose) {
                case 1:
                    drawRectangle();
                    break;
                case 2:
                    drawTriangle();
                    break;
                case 3:
                    drawIsolatedTriangle();
                    break;
            }

        }while (choose > 0 && choose < 4);
    }
}