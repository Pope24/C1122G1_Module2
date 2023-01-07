package Ss11_Stack_Queue.practice.Optional_deploy_Queue_use_array;

import java.util.Arrays;

public class MyQueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.enqueue(5);
        queue.enqueue(56);
        queue.enqueue(32);
        queue.enqueue(33);
        queue.enqueue(76);
        queue.enqueue(99);
        queue.dequeue();
        queue.dequeue();
    }
}
