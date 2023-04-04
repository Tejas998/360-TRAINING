package com.assignment.Task5;

import java.util.Scanner;

public class Task5Two {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String[] words = str.split(" ");
        StringBuilder rev = new StringBuilder();

        for (String word : words) {
            StringBuilder revWords = new StringBuilder(word).reverse();
            rev.append(revWords).append(" ");
        }
        System.out.println("Reversed string with words: " + rev.toString().trim());
    }
}
