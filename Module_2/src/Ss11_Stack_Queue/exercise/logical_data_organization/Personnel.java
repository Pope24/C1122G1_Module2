package Ss11_Stack_Queue.exercise.logical_data_organization;

import java.time.LocalDate;
import java.util.Date;

public class Personnel {
    private String name;
    private String gender;
    private LocalDate dateOfBirth;
    private String position;

    public Personnel(String name, String gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public Personnel(String name, String gender, LocalDate dateOfBirth, String position) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", position='" + position + '\'' +
                '}';
    }
}
