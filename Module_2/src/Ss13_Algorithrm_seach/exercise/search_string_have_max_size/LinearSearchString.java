package Ss13_Algorithrm_seach.exercise.search_string_have_max_size;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinearSearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi cua ban muon tim kiem: ");
        String str = sc.nextLine();
        LinkedList<Character> charList = new LinkedList<>();
        LinkedList<Character> strMaxSize = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (charList.size() > 1 && str.charAt(i) <= charList.getLast() && charList.contains(str.charAt(i))) {
                charList.clear();
            }
            charList.add(str.charAt(i));
            if (charList.size() > strMaxSize.size()) {
                strMaxSize.clear();
                strMaxSize.addAll(charList);
            }
        }
        System.out.println(strMaxSize);
    }
}
