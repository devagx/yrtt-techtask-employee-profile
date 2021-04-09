package com.company;

public interface Employee {
     void setSalary (int salary);
     int getSalary();
     void setGrade(String grade);
     String getGrade();
     default void label(){
         System.out.println("Employee's data:");
     }
}
