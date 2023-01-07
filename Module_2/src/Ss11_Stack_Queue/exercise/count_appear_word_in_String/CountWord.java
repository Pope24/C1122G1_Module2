package Ss11_Stack_Queue.exercise.count_appear_word_in_String;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        TreeMap<String, Integer> strTree = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi can dem:");
        String strNeedCount = sc.nextLine();
        strNeedCount = strNeedCount.toLowerCase();
        String[] strArr = strNeedCount.split("");
        for (String word : strArr) {
            if (!strTree.containsKey(word)) {
                strTree.put(word, 1);
            } else {
                int count = strTree.get(word);
                strTree.put(word, count + 1);
            }
        }
        System.out.println(strTree);

    }
}
