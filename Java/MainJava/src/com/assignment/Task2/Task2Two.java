package com.assignment.Task2;
import java.util.Scanner;

public class Task2Two {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        char ch = sc.next().charAt(0);
        if ( (ch >= 'a' & ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch + " is Alphabet");
        }
        else {
            System.out.println(ch + " : is not an alphabet ");
        }
    }
}
