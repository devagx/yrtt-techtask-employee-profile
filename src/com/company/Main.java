package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       String input = "ENGINEER";
        int n = 1;

        for (int i = 0; i < n; i++) {
            if (input.equals("ENGINEER")) {
                Engineer e = new Engineer();
                e.setSalary(100);
                e.setGrade("newG");
                e.label();
                System.out.println("GRADE : " + e.getGrade());
                System.out.println("SALARY : " + e.getSalary());
            }
            if (input.equals("MANAGER")) {
                Manager e = new Manager();
                e.setSalary(100);
                e.setGrade("newG");
                e.label();
                System.out.println("GRADE : " + e.getGrade());
                System.out.println("SALARY : " + e.getSalary());
            }
        }
    }
}
