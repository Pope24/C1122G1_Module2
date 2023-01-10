package Ss13_Algorithrm_seach.exercise.set_binarySearch_use_recusion;

import java.util.Arrays;
import java.util.Scanner;

public class SearchBinary {
    public static int searchBinary(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (value > array[middle]) {
            left = middle + 1;
        } else if (value == array[middle]) {
            return middle;
        } else {
            right = middle - 1;
        }
        return searchBinary(array, left, right, value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang");
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhap phan tu cua mang");
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Nhap gia tri can tim kiem: ");
        int value = sc.nextInt();
        System.out.println("Vi tri tim duoc la: " + searchBinary(array, 0, length - 1, value));
    }
}
