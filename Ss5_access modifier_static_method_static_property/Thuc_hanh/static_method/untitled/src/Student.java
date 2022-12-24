
public class Student {
    private int rollno;
    private String name;
    private static String college = "FPT";
    public Student(int roll,String name) {
        this.rollno = roll;
        this.name = name;
    }
    public static void change(String newCollege) {
        college = newCollege;
    }
    void display() {
        System.out.println("Name " + this.name + " Roll "+ this.rollno + " College " + this.college);
    }
}

