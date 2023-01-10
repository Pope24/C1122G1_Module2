package Ss11_Stack_Queue.exercise.logical_data_organization;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class ArrangePersonnel {
    public static void main(String[] args) throws IOException {
        ArrayList<Personnel> listPersonnel = new ArrayList<>(5);
        Queue<Personnel> NU = new LinkedList<>();
        Queue<Personnel> NAM = new LinkedList<>();

        listPersonnel.add(new Personnel("Chinh", "NAM", LocalDate.of(2003, 02, 24), "CEO"));
        listPersonnel.add(new Personnel("Minh", "NAM", LocalDate.of(1998, 07, 12), "Developer"));
        listPersonnel.add(new Personnel("Lanh", "NAM", LocalDate.of(1990, 11, 01), "Developer"));
        listPersonnel.add(new Personnel("Hong", "NU", LocalDate.of(2002, 10, 16), "Tester"));
        listPersonnel.add(new Personnel("Giang", "NU", LocalDate.of(2003, 12, 03), "Manager"));
        Collections.sort(listPersonnel, new SortPersonnel());
        for (Personnel personnel : listPersonnel) {
            if (personnel.getGender().equals("NU")) {
                NU.add(personnel);
            }
            if (personnel.getGender().equals("NAM")) {
                NAM.add(personnel);
            }
        }
        FileWriter fw = new FileWriter("C:\\CodeGym\\Module_2\\Module_2\\src\\Ss11_Stack_Queue\\exercise\\logical_data_organization\\personnel.txt");
        for (Personnel personnel : NU) {
            fw.write(String.valueOf(personnel) + "\n");
        }
        for (Personnel personnel : NAM) {
            fw.write(String.valueOf(personnel) + "\n");
        }
        fw.close();
    }
}
