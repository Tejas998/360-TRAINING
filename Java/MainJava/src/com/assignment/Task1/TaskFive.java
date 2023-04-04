package com.assignment.Task1;

import java.util.Scanner;

public class TaskFive {
    public static void main(String args[]){

        double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius = sc.nextInt();

        double area = PI * radius * radius;
        System.out.println("Area of Circle is: " + area);
    }
}
