package Ss13_Algorithrm_seach.exercise.search_string_ascending_max_size;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchStringAscending {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap chuoi ban muon tim kiem: ");
        String str = sc.nextLine();
        List<Integer> arrAscii = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            arrAscii.add((int) str.charAt(i));
        }
        int max = arrAscii.get(0);
        System.out.print((char) max);
        for (int i = 1; i < arrAscii.size(); i++) {
            if (max < arrAscii.get(i)) {
                max = arrAscii.get(i);
                System.out.print((char) max);
            }
        }
    }
}
