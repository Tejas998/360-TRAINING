package com.assignment.Task7;

import java.util.Scanner;

public class Task7Five {
    public static void main(String args[]) {

        int number, digit, result = 0, n;

        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        number = n;
        while (n!= 0)
        {
            digit = n % 10;
            result += Math.pow(digit, 3);
            n /= 10;
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number");
        else
            System.out.println(number + " is not an Armstrong number");
    }
}
