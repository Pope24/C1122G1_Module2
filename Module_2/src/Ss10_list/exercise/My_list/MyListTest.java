package Ss10_list.exercise.My_list;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> arrList = new MyList<Integer>(3);
        arrList.add(0, 45);
        arrList.add(1, 99);
        arrList.add(2, 24);
        System.out.println(arrList);
        System.out.println("Size of array is "+arrList.getSize());
        arrList.remove(1);
        System.out.println("Array after remove elm is "+arrList);
        System.out.println("Size of array is "+arrList.getSize());
        System.out.println(arrList.contains(24));
        arrList.clear();
        System.out.println("Array after clear elm is "+arrList);
    }
}
