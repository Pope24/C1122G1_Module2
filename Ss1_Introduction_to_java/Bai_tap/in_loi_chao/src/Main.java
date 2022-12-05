import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cua ban: ");
        String yourName = sc.nextLine();
        System.out.println("Hello: " + yourName);
    }
}