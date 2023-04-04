package com.assignment.Task5;

import java.util.Scanner;

public class Task5Six {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Main String: ");
        String strMain = sc.nextLine();
        System.out.print("Enter a Substring: ");
        String strSub = sc.nextLine();

        if (strMain.contains(strSub)){
            System.out.println("yes it's a Substring");
        }
        else{
            System.out.println("No  it's not a Substring");
        }
    }
}
