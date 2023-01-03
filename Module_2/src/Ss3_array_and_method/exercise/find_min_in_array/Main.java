package Ss3_array_and_method.exercise.find_min_in_array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("So luong phan tu co trong mang la: ");
        int lengthArr = sc.nextInt();
        int[] arr;
        arr = new int[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            System.out.println("Nhap gia tri phan tu thu " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Mang cua ban la: " + Arrays.toString(arr));
        getMinNumber(arr);
    }
    static void getMinNumber(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Phan tu be nhat trong mang la: "+ min);
    }
}
