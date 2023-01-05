package Ss4_class_and_object_java.exercise.class_StopWatch;

import java.util.Scanner;

public class StopWatchTest {
    public static int[] sort(int arr[]) {
        int n = arr.length;

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println("Nhap \"start\" to begin count milisecond !!");
        System.out.println(stopWatch.start());
        int[] arr = new int[] {2,45,7,4,4,8,5,33,3};
        sort(arr);
        System.out.println("Nhap \"start\" to end count milisecond !!");
        System.out.println(stopWatch.stop());
        System.out.println(stopWatch.getElapsedTime());
    }
}
