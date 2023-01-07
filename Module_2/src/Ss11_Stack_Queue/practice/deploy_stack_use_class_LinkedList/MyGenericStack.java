package Ss11_Stack_Queue.practice.deploy_stack_use_class_LinkedList;


import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    public void push(T e) {
        stack.addFirst(e);
    }

    public T pop() {
        if (size() == 0) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return size() == 0 ? true : false;
    }

}
