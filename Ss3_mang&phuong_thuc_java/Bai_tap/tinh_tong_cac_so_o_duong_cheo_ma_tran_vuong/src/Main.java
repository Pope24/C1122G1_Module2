import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang cua ma tran vuong. Luu y, row will equal column.");
        int rowLengthArr = sc.nextInt();
        int arr[][];
        arr = new int[rowLengthArr][rowLengthArr];
        for (int i = 0; i < rowLengthArr; i++) {
            for (int j = 0; j < rowLengthArr; j++) {
                System.out.println("Nhap phan tu thu "+(j + 1)+ " cua hang thu "+(i + 1));
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rowLengthArr; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int totalElmDiagonalLine1 = 0;
        int totalElmDiagonalLine2 = 0;
        int j = 0;
        for (int i = 0; i < rowLengthArr; i++) {
            totalElmDiagonalLine1 += arr[i][j];
            j++;
        }
        int k = rowLengthArr - 1;
        for (int i = 0; i < rowLengthArr; i++) {
            totalElmDiagonalLine2 += arr[i][k];
            k--;
        }
        System.out.println("Tong cac phan tu cua duong cheo thu nhat la "+totalElmDiagonalLine1);
        System.out.println("Tong cac phan tu cua duong cheo thu hai la "+totalElmDiagonalLine2);
    }
}