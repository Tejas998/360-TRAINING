package com.assignment.Task2;

import java.util.Scanner;

public class Task2Three {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dividend : ");
        int dividend = sc.nextInt();
        System.out.println("Enter Divisor : ");
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient is : " + quotient);
        System.out.println("Reminder is : " + remainder);

    }
}
