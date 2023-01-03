package Ss2_loop_java.exercise.print_snt_less_than_100;

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
        for (int i = 2; i <= 100; i++) {
            if (checkPrime(i)) {
                System.out.print(i + "  ");
            }
        }
    }
}