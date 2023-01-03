package Ss3_array_and_method.exercise.find_max_in_array_2_dismenal;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void getMaxNumberInArr(int[][]arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("So lon nhat trong mang 2 chieu la: " +max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang cua mang 2 chieu = ");
        int rowLength = sc.nextInt();
        System.out.println("Nhap so phan tu trong moi hang = ");
        int colLength = sc.nextInt();
        int arr[][];
        arr = new int[rowLength][colLength];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                System.out.println("Nhap phan tu thu "+(j + 1)+" cua hang thu " +(i + 1));
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mang 2 chieu cua ban la"+Arrays.deepToString(arr));
        getMaxNumberInArr(arr);
    }
}