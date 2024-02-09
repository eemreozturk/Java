package org.example;

public class customer implements Icustomer
{
    public int id;
    public String name;
    public boolean isStudent;

    public int getId() {
        return id;
    }

    public customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public boolean isOfficer() {
        return isOfficer;
    }

    public void setOfficer(boolean officer) {
        isOfficer = officer;
    }

    public boolean isOfficer;
}

interface Icustomer
{

}