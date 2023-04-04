package com.assignment.Task7;

import java.util.Arrays;
import java.util.Scanner;

public class Task7Elevan {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a sum which you want to perform: ");
        int resultSum = sc.nextInt();

        System.out.println("Your main array: " + Arrays.toString(arr));
        System.out.println("Sub array with sum is: " + resultSum);

        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for (int j=i; j<arr.length; j++){
                sum = sum + arr[j];
                if(sum == resultSum){
                    System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j+1)));
                }
            }
        }
    }
}