package com.assignment.Task3;

import java.util.Scanner;

public class Task3One {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int firstNum = 0;
        int secondNum = 1;

        System.out.print("Fibonacci Series of " + number + " is :- ");

        for (int i = 1; i <= number; i++) {
            System.out.print(firstNum + " ");
            int nextTerm = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextTerm;
        }
    }
}
