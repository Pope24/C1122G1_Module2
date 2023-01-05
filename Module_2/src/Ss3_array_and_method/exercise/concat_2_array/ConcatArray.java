package Ss3_array_and_method.exercise.concat_2_array;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        Nhap mang thu nhat
        System.out.print("So luong phan tu cua mang thu nhat la = ");
        int lengthArr1 = sc.nextInt();
        int[] arr1;
        arr1 = new int[lengthArr1];
        for (int i = 0; i < lengthArr1; i++) {
            System.out.print("Phan tu thu "+(i + 1)+" cua mang 1 = ");
            arr1[i] = sc.nextInt();
        }
//        Nhap mang thu 2
        System.out.print("So luong phan tu cua mang thu hai la = ");
        int lengthArr2 = sc.nextInt();
        int[] arr2;
        arr2 = new int[lengthArr2];
        for (int i = 0; i < lengthArr2; i++) {
            System.out.print("Phan tu thu "+(i + 1)+" cua mang 2 = ");
            arr2[i] = sc.nextInt();
        }
        System.out.println("Mang thu nhat la "+Arrays.toString(arr1));
        System.out.println("Mang thu hai la "+Arrays.toString(arr2));
//        Ghep 2 mang lai voi nhau
        int[] arr3;
        arr3 = new int[lengthArr1 + lengthArr2];
        for (int i = 0; i < lengthArr1; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = lengthArr1; i < arr3.length; i++) {
            arr3[i] = arr2[i - lengthArr1];
        }
        System.out.print("2 mang sau khi duoc ghep lai thanh " + Arrays.toString(arr3));
    }
}
