package com.assignment.Task2;

import java.util.Scanner;

public class Task2Six {
    public static void main(String args[]){

        double x, y, result;
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("****************************************************");

        System.out.println("Please select int form below options from 1 to 4: ");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");

        System.out.println("****************************************************");
        num = sc.nextInt();

        System.out.println("Enter X number:");
        x = sc.nextDouble();

        System.out.println("Enter Y number:");
        y = sc.nextDouble();


        switch (num){
            case  1 :
                result = x + y;
                System.out.println("Addition of X and Y is : " + result);
                break;
            case  2 :
                result = x - y;
                System.out.println("Subtraction of X and Y is : " + result);
            case  3 :
                result = x * y;
                System.out.println("Multiplication of X and Y is : " + result);
            case  4 :
                result = x / y;
                System.out.println("Division of X an Y is : " + result);
                break;
        }
    }
}
