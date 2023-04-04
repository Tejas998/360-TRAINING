package com.assignment.Task7;
import java.util.Scanner;

public class Task7Three {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        boolean unique = true;

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(str.indexOf(c) != str.lastIndexOf(c)) {
                unique = false;
                break;
            }
        }
        if(unique) {
            System.out.println(str + " <-- this string have all unique chars");
        } else {
            System.out.println(str + " <-- this string does not have unique chars");

        }

    }
}
