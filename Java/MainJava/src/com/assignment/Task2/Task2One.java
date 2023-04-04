package com.assignment.Task2;

import java.util.Scanner;

public class Task2One {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if ( number < 0 ){
            System.out.println(number + " : Number is Negative ");
        }
        else {
            System.out.println(number + " : Number is Positive ");
        }
    }
}
