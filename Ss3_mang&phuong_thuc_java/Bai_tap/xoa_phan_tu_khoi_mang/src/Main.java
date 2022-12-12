import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("So phan tu cua mang = ");
        int lengthArr = sc.nextInt();
        int[] arr = new int[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " cua mang: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Nhap phan tu ban muon xoa: ");
        int deleteElm = sc.nextInt();
        int newArr[];
        newArr = new int[lengthArr - 1];
        for (int i = 0, k = 0; i < lengthArr; i++) {
            if (arr[i] != deleteElm) {
                newArr[k] = arr[i];
                k++;
            }
        }
        System.out.println("Mang sau khi xoa 1 phan tu la " + Arrays.toString(newArr));
    }
}