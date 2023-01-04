package Ss10_list.exercise.Linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> ll = new MyLinkedList<>(10);
        ll.add(0, 2);
        ll.add(1, 4);
        ll.add(2, 5);
        ll.add(3, 99);
        System.out.println("Value of pre array is: ");
        ll.printList();
        System.out.println("Array after add 30 into first, 69 into last array is: ");
        ll.addFirst(30);
        ll.addLast(69);
        ll.printList();
        System.out.println("Value of array after remove index 3 and is: ");
        ll.remove(3);
        ll.printList();
        System.out.println("Check index of 99 in array: " + ll.indexOf(99));
        System.out.println("Check 87 contains in array: "+ll.constrains(87));;

    }

}
