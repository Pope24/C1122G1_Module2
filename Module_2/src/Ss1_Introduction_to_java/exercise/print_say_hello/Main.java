package Ss1_Introduction_to_java.exercise.print_say_hello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cua ban: ");
        String yourName = sc.nextLine();
        System.out.println("Hello: " + yourName);
    }
}
