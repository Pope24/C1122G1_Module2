package Ss11_Stack_Queue.exercise.logical_data_organization;

import java.util.Comparator;


class SortPersonnel implements Comparator<Personnel> {

    // Method of this class
    // @Override

    @Override
    public int compare(Personnel o1, Personnel o2) {
        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }
}
