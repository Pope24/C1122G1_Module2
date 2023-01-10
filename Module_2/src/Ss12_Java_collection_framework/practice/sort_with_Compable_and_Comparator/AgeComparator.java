package Ss12_Java_collection_framework.practice.sort_with_Compable_and_Comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getAge() > s2.getAge()) {
            return 1;
        }
        else if (s1.getAge() == s2.getAge()) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
