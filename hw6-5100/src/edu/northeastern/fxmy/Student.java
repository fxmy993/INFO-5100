package edu.northeastern.fxmy;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private double gpa;
    public Student(String name, double gpa, Date dateOfBirth){
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    private Date dateOfBirth;
}