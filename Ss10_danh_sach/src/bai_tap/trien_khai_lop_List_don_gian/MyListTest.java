package bai_tap.trien_khai_lop_List_don_gian;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> arrInt = new MyList<Integer>();
        arrInt.add(3);
        arrInt.add(34);
        arrInt.add(54);
        arrInt.add(32);
        arrInt.add(99);
        arrInt.add(88);
        System.out.println("element 4: "+arrInt.get(4));
        System.out.println("element 1: "+arrInt.get(1));
        arrInt.get(8);
        System.out.println("element 8: "+arrInt.get(8));
    }
}
