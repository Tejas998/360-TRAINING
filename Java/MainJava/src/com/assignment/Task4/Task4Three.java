package com.assignment.Task4;

import java.util.Scanner;

public class Task4Three {

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

            for(i = 0; i< n; i++){
                if(arr[i] == search){
                    System.out.println("Present : " + arr[i]);
                    break;
                }
            }
            if(i == n){
                System.out.println("Not Present");

            }
    }

}
