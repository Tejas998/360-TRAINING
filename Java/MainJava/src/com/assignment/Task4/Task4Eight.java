package com.assignment.Task4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4Eight {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int n = sc.nextInt(), result;

        int arr[] = new int[n];

        for(int i=0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Your Array is: ");
        for(int i=0; i< n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Arrays.sort(arr);
        System.out.println("Array Sorting :" + Arrays.toString(arr));
        result = arr[n-3];
        System.out.println("Third largest element is :" + result);
    }
}
