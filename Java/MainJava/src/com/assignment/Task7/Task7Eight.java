package com.assignment.Task7;
import java.util.Scanner;
public class Task7Eight {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of elements for array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Your Array is: ");

        for(int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Maximum element in array is : " + max);

    }
}
