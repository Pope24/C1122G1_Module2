package Ss11_Stack_Queue.practice.deploy_Queue_use_linked_list;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;
    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;

    }
    public void enqueue(int key) {
        Node temp = new Node(key);
        if (tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.head.next = temp;
        this.tail = temp;
    }
    public Node dequeue() {
        if (this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        return temp;
    }
}
