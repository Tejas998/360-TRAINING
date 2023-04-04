package com.assignment.Task2;

import java.util.Scanner;

public class Task2Five {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Grade : ");
        int percentage = sc.nextInt();

        char grade;

        if (percentage > 90) {
            grade = 'A';
        } else if (percentage > 75) {
            grade = 'B';
        } else if (percentage > 65) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("Your Grade: " + grade);

    }
}
