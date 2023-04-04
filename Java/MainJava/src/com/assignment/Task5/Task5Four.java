package com.assignment.Task5;

import java.util.Scanner;

public class Task5Four {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int count = 0;

        for(int i = 0; i< str.length(); i++){

            if (str.charAt(i) == 'a' || str.charAt(i) == 'A')
            {
                count++;
            }
        }
        System.out.println("Occurrence of a is: " + count + " Times");
    }
}
