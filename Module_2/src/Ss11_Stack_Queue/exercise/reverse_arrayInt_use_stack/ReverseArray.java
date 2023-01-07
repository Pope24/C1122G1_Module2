package Ss11_Stack_Queue.exercise.reverse_arrayInt_use_stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

//        Reverse integer array
        int[] arrayPrevious = {3, 5, 2, 4, 7, 5, 3, 8};
        for (int elmArray : arrayPrevious) {
            integerStack.push(elmArray);
        }
        int[] newIntegerArray = new int[arrayPrevious.length];
        for (int i = 0; i < newIntegerArray.length; i++) {
            newIntegerArray[i] = integerStack.pop();
        }
        System.out.println(Arrays.toString(newIntegerArray));

//        Reverse string
        String strArray = "le van chinh";
        String[] newStringArr = strArray.split("");
        for (String word : newStringArr) {
            stringStack.push(word);
        }
        String[] stringReverse = new String[newStringArr.length];
        for (int i = 0; i < stringReverse.length; i++) {
            stringReverse[i] = stringStack.pop();
        }
        System.out.println(String.join("", stringReverse));
    }
}
