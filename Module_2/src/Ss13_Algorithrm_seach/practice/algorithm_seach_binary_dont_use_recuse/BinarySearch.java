package Ss13_Algorithrm_seach.practice.algorithm_seach_binary_dont_use_recuse;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    static int[] arr = {45, 2, 64, 23, 54, 66, 88, 99, 34, 11};

    public static int searchBinary(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key == arr[mid]) {
                return mid;
            } else low = mid + 1;

        }
        return -1;
    }

    public static void main(String[] args) {
        Arrays.sort(arr);
        System.out.println(searchBinary(arr, 3));
        System.out.println(searchBinary(arr, 66));
        System.out.println(searchBinary(arr, 23));
        System.out.println(searchBinary(arr, 0));
        System.out.println(searchBinary(arr, 12));
        System.out.println(searchBinary(arr, 11));
    }
}
