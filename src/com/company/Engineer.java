package com.company;

public class Engineer implements Employee {
    private int salary;
    private String grade;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return this.grade;
    }



}
