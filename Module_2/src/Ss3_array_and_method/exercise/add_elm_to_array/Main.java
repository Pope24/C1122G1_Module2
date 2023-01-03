package Ss3_array_and_method.exercise.add_elm_to_array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang = ");
        int lengthArr = sc.nextInt();
        int arr[];
//        Chứa thêm một phần tử zero để lùi chỗ các giá trị sau cho giá trị mới
        arr = new int[lengthArr + 1];
//        Nhập các giá trị của mảng
        for (int i = 0; i < lengthArr; i++) {
            System.out.print("Phan tu thu " +(i + 1) +" = " );
            arr[i] = sc.nextInt();
        }
//        Nhập giá trị và vị trí cần thêm của phần tử mới
        System.out.println(Arrays.toString(arr));
        System.out.print("New value need to add into array = ");
        int newValue = sc.nextInt();
        System.out.print("Index of value that you want =");
        int indexOfValue = sc.nextInt();
//        Add phần tử mới vào mảng
        for (int i =lengthArr; i > indexOfValue; i--) {
            arr[i] = arr[i-1];
        }
        arr[indexOfValue] = newValue;
        System.out.print("New value   "+Arrays.toString(arr));
    }
}
