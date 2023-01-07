package Ss11_Stack_Queue.practice.deploy_stack_use_class_LinkedList;

import java.util.Arrays;

public class GenericStackClient {
    public static void stackOfString() {
        MyGenericStack<String> carStack = new MyGenericStack<>();
        carStack.push("Mazda");
        carStack.push("Toyota");
        carStack.push("Honda");
        carStack.push("Mercedes");
        carStack.push("Ferrari");
        System.out.println("Size of stack is: " + carStack.size());
        System.out.println("Check empty is: " +carStack.isEmpty());
        System.out.println("Remove last element is is" + carStack.pop());
        System.out.println("Size now of stack is: " + carStack.size());
    }
    public static void stackOfInteger() {
        MyGenericStack<Integer> intStack = new MyGenericStack<>();
        intStack.push(1);
        intStack.push(5);
        intStack.push(3);
        intStack.push(2);
        intStack.push(11);
        intStack.push(45);
        System.out.println("Size now of stack is: " + intStack.size());
        intStack.pop();
        System.out.println("Size after remove last element of stack is: " + intStack.size());
        while (intStack.isEmpty() == false) {
            intStack.pop();
        }
        System.out.println("Stack is empty: " + intStack.isEmpty());
    }
    public static void main(String[] args) {
        System.out.println("Stack of string");
        stackOfString();
        System.out.println("Stack of integer");
        stackOfInteger();
    }
}
