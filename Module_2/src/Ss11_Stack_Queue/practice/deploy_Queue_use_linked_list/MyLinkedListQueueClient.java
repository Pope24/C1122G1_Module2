package Ss11_Stack_Queue.practice.deploy_Queue_use_linked_list;

public class MyLinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(5);
        queue.dequeue();
        queue.enqueue(45);
        queue.enqueue(22);
        queue.enqueue(89);
        queue.enqueue(67);
        System.out.println(queue.dequeue().key);
    }
}
