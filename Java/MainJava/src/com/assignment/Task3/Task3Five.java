package com.assignment.Task3;
import java.util.Scanner;
public class Task3Five {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int sum = 0, i=1, count =0;
        while (count < number){
            if (i % 2 == 0){
                sum = sum + i;
                count++;
            }
            i++;
        }
        System.out.println("Sum of Even Number is : " + sum);
    }
}
