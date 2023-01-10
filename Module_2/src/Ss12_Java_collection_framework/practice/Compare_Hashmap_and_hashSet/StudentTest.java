package Ss12_Java_collection_framework.practice.Compare_Hashmap_and_hashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Chinh", 20, "Quang Binh");
        Student s2 = new Student("Minh", 25, "Nghe An");
        Student s3 = new Student("Lanh", 30, "Quang Nam");
        Student s4 =  new Student("Quoc Anh", 22, "Quang Tri");
        Map<Integer, Student> hashMapStudent = new HashMap<>();
        hashMapStudent.put(1, s1);
        hashMapStudent.put(2, s2);
        hashMapStudent.put(3, s3);
        hashMapStudent.put(4, s4);
        hashMapStudent.put(5, s1);
        for (Map.Entry<Integer,Student> student: hashMapStudent.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("Hash Set");
        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s1);
        for (Student student: students) {
            System.out.println(student.toString());
        }
    }
}
