package Ss11_Stack_Queue.exercise.check_brackets_use_stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
        Stack<String> bStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter math expression you want to check: ");
        String expression = sc.nextLine();
        String[] expressionArr = expression.split("");
        boolean flag = true;
        for (int i = 0; i < expressionArr.length; i++) {
            if (expressionArr[i].equals("(")) {
                bStack.push(expressionArr[i]);
            }
            if (expressionArr[i].equals(")")) {
                if (bStack.isEmpty()) {
                    flag = false;
                    break;
                } else {
                    bStack.pop();
                }
            }
        }
        if (flag && bStack.isEmpty()) {
            System.out.println("Well !!");
        } else System.out.println("Not well !!");

    }
}
