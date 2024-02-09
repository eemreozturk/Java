package org.example;

public class customer implements Iproducts {
    public int id;
    public String name;
    public boolean isStudent;
    public boolean isOfficer;

    public customer(int id, String name, boolean isStudent, boolean isOfficer) {
        this.id = id;
        this.name = name;
        this.isStudent = isStudent;
        this.isOfficer = isOfficer;
    }

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
}



