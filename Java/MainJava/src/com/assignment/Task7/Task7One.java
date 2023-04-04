package com.assignment.Task7;
import java.util.Scanner;
public class Task7One {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        boolean b = true;

        for(char i :str.toCharArray())
        {
            if (str.indexOf(i) == str.lastIndexOf(i))
            {
                System.out.println("First non-repeating character is: "+ i);
                b = false;
                break;
            }
        }

        if(b)
            System.out.println("No non-repeating character in the entered string");
    }
}
