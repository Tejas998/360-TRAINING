package com.assignment.Task4;

import java.util.Scanner;

public class Task4Two {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int n = sc.nextInt();
        int sum = 0;

        int arr[] = new int[n];

        for(int i=0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0; i< n; i++){
            sum = sum + arr[i];
        }
        double avg = sum / n;
        System.out.print("Avg of Array is: " + avg);
    }

}
