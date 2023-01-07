package Ss11_Stack_Queue.practice.Optional_deploy_Queue_use_array;

public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;
    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[queueSize];
    }
    public boolean isQueueFull() {
        if (capacity == currentSize) {
            return true;
        }
        return false;
    }
    public boolean isQueueEmpty(){
        if (currentSize == 0) {
            return true;
        }
        return false;
    }
    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Queue is full, can not enqueue "+item+" !!!");
        }
        else {
            tail++;
            queueArr[tail] = item;
            currentSize++;
        }
    }
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty, can not dequeue !!");
        }
        else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Removed: " +queueArr[head - 1]);
                head = 0;
            }
            else {
                System.out.println("Removed: " + queueArr[head - 1]);
            }
        }
        currentSize--;
    }
}
