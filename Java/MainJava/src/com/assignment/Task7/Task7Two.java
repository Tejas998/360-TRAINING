package com.assignment.Task7;
import java.util.Scanner;

public class Task7Two {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of elements for array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int i,j;
        for(i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        for (j = 0; j<arr2.length; j++){
            arr2[j] = sc.nextInt();
        }

        System.out.print("Your First Array is: ");

        for(i=0; i< arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.print("Your Second Array is: ");

        for(i=0; i< arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        System.out.println();
        System.out.print("Intersection of two arrays are: ");
        for(i = 0;i < arr1.length; i++) {
            for(j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }
}
