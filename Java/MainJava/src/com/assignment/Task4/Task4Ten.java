package com.assignment.Task4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4Ten {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int n = sc.nextInt(), result;
        int arr[] = new int[n];
        int arr2[] = new int[n];

        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i< arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.print("Your First Array is: ");

        for(int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Your Second Array is: ");

        for(int i=0; i< arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        if (Arrays.equals(arr, arr2)){
            System.out.println("Arrays Are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}
