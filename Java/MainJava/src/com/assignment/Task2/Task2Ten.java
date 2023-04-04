package com.assignment.Task2;

import java.util.Scanner;

public class Task2Ten {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Basic Salary: ");

        double basicSalary = sc.nextDouble();
        double grossSalary = 0, hra = 0, da = 0;

        if (basicSalary <= 15000) {
            hra = basicSalary * 0.25;
            da = basicSalary * 0.82;
        } else if (basicSalary <= 20200) {
            hra = basicSalary * 0.27;
            da = basicSalary * 0.90;
        } else if (basicSalary > 20200) {
            hra = basicSalary * 0.36;
            da = basicSalary * 0.95;
        }
        grossSalary = basicSalary + hra + da;
        System.out.println("Gross Salary is: " + grossSalary);
    }
}
