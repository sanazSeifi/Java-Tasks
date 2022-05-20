package com.example.getmehired_tasks;

import java.util.Scanner;

public class Assignment1Task2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to find Factorial Number: ");
        int number = scanner.nextInt();

        long fact = 1;
        int i = 1;
        while (i<= number){
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + number + " is " + fact);
    }
}
