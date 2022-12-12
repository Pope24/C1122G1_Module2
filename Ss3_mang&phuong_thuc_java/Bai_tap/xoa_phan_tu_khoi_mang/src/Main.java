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
        System.out.println("Value     " + Arrays.toString(arr));
        System.out.print("Nhap phan tu ban muon xoa: ");
        int deleteElm = sc.nextInt();
        boolean flag = true;
        for (int i = 0; i < lengthArr; i++) {
            if (arr[i] == deleteElm) {
                for (int k = i; k < lengthArr - 1; k++) {
                    arr[k] = arr[k + 1];
                }
                arr[lengthArr - 1] = 0;
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Can not find this element !!");
        } else {
            System.out.println("New value  " + Arrays.toString(arr));
        }
    }
}