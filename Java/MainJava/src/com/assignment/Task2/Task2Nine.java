package com.assignment.Task2;

import java.util.Scanner;

public class Task2Nine {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit charges: ");

        int units = sc.nextInt();
        double totalBill = 0;

        if (units <= 60) {
            totalBill = units * 0.30;
        } else if (units > 60 && units <= 150) {
            totalBill = 18 + (units - 60) * 0.75;
        } else if (units > 150 && units <= 270) {
            totalBill = 90 + (units - 150) * 1.10;
        } else if (units > 270) {
            totalBill = 234 + (units - 270) * 2.50;
        }

        double surcharge = totalBill * 0.20;
        double finalResultOfBill = totalBill + surcharge;

        System.out.println("Electricity Bill is: " + finalResultOfBill);

    }
}
