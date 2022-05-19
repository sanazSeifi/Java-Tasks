package com.example.getmehired_tasks;

import java.util.Scanner;

public class Assignment1Task1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = s.nextInt();
        s.close();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.print("Sum =" + sum);
    }
}