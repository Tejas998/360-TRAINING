package com.assignment.Task5;

import java.util.Scanner;

public class Task5Seven {
    public static boolean isIsogram(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) != str.lastIndexOf(c)) {
                System.out.print(str + " is not Isogram : ");
                return false;
            }
        }
        System.out.print(str + " is Isogram : ");
        return true;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        boolean iso = isIsogram(str);
        System.out.println(iso);

    }
}
