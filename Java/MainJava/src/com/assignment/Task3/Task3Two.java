package com.assignment.Task3;

import java.util.Scanner;

public class Task3Two {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int factorial = 1;

        System.out.print("Factorial of " + number + " is :- ");

        for (int i = 1; i <= number; i++) {
           factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
