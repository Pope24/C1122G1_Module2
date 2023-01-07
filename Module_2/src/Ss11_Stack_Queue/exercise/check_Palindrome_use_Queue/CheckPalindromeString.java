package Ss11_Stack_Queue.exercise.check_Palindrome_use_Queue;

import java.util.*;

public class CheckPalindromeString {
    public static void main(String[] args) {
        Stack<String> strStack = new Stack<>();
        Queue<String> strQueue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string need to check Palindrome: ");
        String str = sc.nextLine().toLowerCase();
        String[] strArr = str.split("");
        for (int i = 0; i < strArr.length; i++) {
            strStack.push(strArr[i]);
            strQueue.add(strArr[i]);
        }
        boolean flag = true;
        for (int i = 0; i < strArr.length; i++) {
            if (!strStack.pop().equals(strQueue.remove())) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("That is Palindrome string");
        } else System.out.println("That is not Palindrome string");
    }
}
