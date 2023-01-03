package Ss3_array_and_method.exercise.calculate_sum_in_column_array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang cua mang 2 chieu = ");
        int rowLengthArr = sc.nextInt();
        System.out.println("Nhap so cot cua mang 2 chieu = ");
        int colLengthArr = sc.nextInt();
        int arr[][];
        arr = new int[rowLengthArr][colLengthArr];
        for (int i = 0; i < rowLengthArr; i++) {
            for (int j = 0; j < colLengthArr; j++) {
                System.out.println("Nhap phan tu thu " + (j + 1) + " cua hang thu " + (i + 1));
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rowLengthArr; i++) {
            System.out.print("Row " + (i + 1));
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Ban muon tinh cot thu bao nhieu ? ");
        int colOfUserInput = sc.nextInt();
        int totalElmInCol = 0;
        if (colOfUserInput > 0 && colOfUserInput <= colLengthArr) {
            for (int i = 0; i < rowLengthArr; i++) {
                totalElmInCol += arr[i][colOfUserInput - 1];
            }
            System.out.println("Tong so phan tu cua cot " + colOfUserInput + " la: " + totalElmInCol);
        } else {
            System.out.println("Cot nay khong co.");
        }
    }
}
