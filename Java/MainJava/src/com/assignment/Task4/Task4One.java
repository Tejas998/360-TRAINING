package com.assignment.Task4;

import java.util.Scanner;

public class Task4One {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i< n; i++){

            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.print("Your array is: ");

        for(int i=0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
