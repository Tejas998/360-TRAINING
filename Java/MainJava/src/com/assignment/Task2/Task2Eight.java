package com.assignment.Task2;

import java.util.Scanner;

public class Task2Eight {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income : ");
        double totalIncome = sc.nextDouble();
        double tax = 0;

        if ((totalIncome > 250000)  && (totalIncome <= 650000)) {
            tax  = (totalIncome * 250000) * 0.1;
        } else if (totalIncome > 600000 && totalIncome <= 1200000) {
            tax = 35000 + (totalIncome - 600000) * 0.18;
        } else if (totalIncome > 1200000) {
            tax = 125000 + (totalIncome - 1200000) * 0.25;
        }
        System.out.println("Your income tax is : " + tax);
    }
}
