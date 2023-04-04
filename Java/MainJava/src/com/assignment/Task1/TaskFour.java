package com.assignment.Task1;

import java.util.Scanner;

public class TaskFour {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        int result = a + b;
        System.out.println("Addition of a + b is : " + result);
    }
}
