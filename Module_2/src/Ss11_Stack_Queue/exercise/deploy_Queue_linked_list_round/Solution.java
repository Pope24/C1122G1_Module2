package Ss11_Stack_Queue.exercise.deploy_Queue_linked_list_round;

public class Solution {
    static class Queue {
        Node front = null;
        Node rear = null;

        public static void enQueue(Queue q, int value) {
            Node newNode = new Node();
            newNode.data = value;
            if (q.front == null) {
                q.front = newNode;
            } else {
                q.rear.link = newNode;
            }
            q.rear = newNode;
            q.rear.link = q.front;
        }

        public static int deQueue(Queue q) {
            if (q.front == null) {
                throw new RuntimeException("Queue is empty.");
            }
            int value;
            if (q.front == q.rear) {
                value = q.front.data;
                q.front = null;
                q.rear = null;
            } else {
                Node temp = q.front;
                value = temp.data;
                q.front = q.front.link;
                q.rear.link = q.front;
            }
            return value;
        }

        static void displayQueue(Queue q) {
            Node temp = q.front;
            System.out.printf(" Elements in Circular Queue are: ");
            while (temp.link != q.front) {
                System.out.printf("%d ", temp.data);
                temp = temp.link;
            }
            System.out.printf("%d", temp.data);
        }

    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        Queue.enQueue(queue, 4);
        Queue.enQueue(queue, 34);
        Queue.enQueue(queue, 222);
        Queue.enQueue(queue, 54);
        Queue.enQueue(queue, 88);
        Queue.displayQueue(queue);
        Queue.deQueue(queue);
        Queue.deQueue(queue);
        Queue.displayQueue(queue);
    }
}
