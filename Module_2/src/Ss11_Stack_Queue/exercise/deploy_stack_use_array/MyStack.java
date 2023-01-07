package Ss11_Stack_Queue.exercise.deploy_stack_use_array;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack {
    private int arr[];
    private int size = 0;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        } else {
            this.arr[index] = element;
            index++;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new StackOverflowError("Stack is empty");
        } else {
            return arr[--index];
        }
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        } else return false;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        } else return false;
    }
}
