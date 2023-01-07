package Ss11_Stack_Queue.exercise.deploy_stack_use_array;

public class StackClient {
    public static void main(String[] args) {
        MyStack arrStack = new MyStack(10);
        System.out.println("Size of array Stack is: " + arrStack.size());
        arrStack.push(4);
        arrStack.push(34);
        arrStack.push(43);
        arrStack.push(99);
        arrStack.push(89);
        arrStack.push(6);
        System.out.println("Check array is full: " + arrStack.isFull());
        System.out.println("Removed: " + arrStack.pop());
        System.out.println("Removed: " + arrStack.pop());
        System.out.println("Size now of array Stack is: " + arrStack.size());
    }
}
