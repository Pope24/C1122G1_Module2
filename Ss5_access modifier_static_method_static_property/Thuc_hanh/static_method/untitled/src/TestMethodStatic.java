public class TestMethodStatic {
    public static void main(String args[]) {
        Student st1 = new Student(1, "Chinh");
        Student st2 = new Student(2, "Phuong");
        Student st3 = new Student(3, "Hiep");
        Student st4 = new Student(4, "Thien");
        Student.change("Codegym");
        st1.display();
        st2.display();
        st3.display();
        st4.display();
    }
}
