package Ss10_list.practice.deploy_linkedList_basic;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(10);
        linkedList.add(2, 3);
        linkedList.addFirst(4);
        linkedList.add(5, 98);
        linkedList.printList();
    }
}
