package com.assignment.Task4;

import java.util.Scanner;

public class Task4Four {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int n = sc.nextInt();
        int i;

        int arr[] = new int[n];

        for(i=0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Your Array is: ");
        for(i=0; i< n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print("Enter Element you want to search : ");
        int search = sc.nextInt();

        int result = binarySearch(arr, search);

        if (result >= 0) {
            System.out.println("Present in Array : " + search);
        } else {
            System.out.println("Not present in array: " + search);
        }
    }

    public static int binarySearch(int[] arr, int search) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == search) {
                return mid;
            } else if (arr[mid] < search) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
