import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien USD ban can chuyen doi sang VND: ");
        int amountMoneyUSD = sc.nextInt();
        int amountMoneyVND = amountMoneyUSD * rate;
        System.out.println("Tong so tien VND sau khi chuyen doi la " + amountMoneyVND + " VND");
    }
}