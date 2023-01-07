package Ss11_Stack_Queue.exercise.convert_decimal_to_binary;

import com.sun.deploy.util.ArrayUtil;
import com.sun.deploy.util.StringUtils;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> binaryStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number need to convert to binary: ");
        int numberDecimal = sc.nextInt();
        while (numberDecimal > 0) {
            int surplus = 0;
            surplus = numberDecimal % 2;
            binaryStack.push(surplus);
            numberDecimal /= 2;
        }
        for (int i = binaryStack.size(); binaryStack.size() < 8; i++) {
            binaryStack.push(0);
        }
        String strResult = "";
        int sizeStack = binaryStack.size();
        for (int i = 0; i < sizeStack; i++) {
            strResult += binaryStack.pop();
        }
        System.out.println(strResult);
    }
}
