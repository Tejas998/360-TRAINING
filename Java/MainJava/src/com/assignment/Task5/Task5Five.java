package com.assignment.Task5;

import java.util.Scanner;

public class Task5Five {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int vcount = 0, cscount=0;
        str = str.toLowerCase();

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                vcount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i)<='z') {
                cscount++;
            }
        }
        System.out.println("Total vowels is: " + vcount);
        System.out.println("Total consonants is: " + cscount);

    }
}
