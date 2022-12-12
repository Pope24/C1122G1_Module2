import java.util.Scanner;

public class Main {
    static boolean checkPrime(int number) {
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
            else {
                flag = true;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban muon in bao nhieu so nguyen to");
        int totalPrime = sc.nextInt();
        int count = 1;
        for (int i = 2; count <=totalPrime; i++) {
            if (checkPrime(i)) {
                System.out.print(i + "  ");
                count++;
            }
        }
    }
}