package com.assignment.Task2;
import java.util.Scanner;

public class Task2Seven {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            if (number < 0) {
                System.out.println("It's Over ");
                break;
            }
            else {
                System.out.println("Good Going");
            }
        }
        sc.close();
    }
}
