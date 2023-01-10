package Ss12_Java_collection_framework.practice.sort_with_Compable_and_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Chinh", 20, "Quang Binh");
        Student student2 = new Student("Hoang Hai", 30, "Hue");
        Student student3 = new Student("Van Y", 25, "Quang Nam");
        Student student4 = new Student("Doan Hai", 24, "Quang Ngai");
        Student student5 = new Student("Xinh Lanh", 24, "Quang Nam");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        Collections.sort(studentList);
        System.out.println(studentList);
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(studentList, ageComparator);
        System.out.println("So sanh theo tuoi");
        System.out.println(studentList);
    }
}
