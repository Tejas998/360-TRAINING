package com.assignment.Task3;
import java.util.Scanner;
public class Task3Six {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int firstNum = 0;
        int secondNum = 1;
        int sum = 0;
        char selection;

        do {
            System.out.print("Enter a first number: ");
            firstNum = sc.nextInt();

            System.out.print("Enter a Second number: ");
            secondNum = sc.nextInt();

            sum = firstNum + secondNum;
            System.out.println("The Sum of these numbers is : " + sum);

            System.out.print("Do you want to continue it  again? Type(Y/N): ");
            selection = sc.next().charAt(0);

        }while (selection == 'Y' || selection == 'y');

    }
}
