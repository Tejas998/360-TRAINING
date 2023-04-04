package com.assignment.Task5;

import java.util.Scanner;

public class Task5One {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String rev = "";
        char ch[] = str.toCharArray();

        for(int i = str.length()-1; i>=0; i--){
            rev = rev + ch[i];
        }
        System.out.println("Reversed String Using For Loop: " + rev);

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed String Using String Builder: " + sb);
    }
}
