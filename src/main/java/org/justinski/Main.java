package org.justinski;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to Justinski product calculator! Please enter five numbers");
        double[] userNumbers = new double[5];

        int i = 0;
        for (double number : userNumbers) {
            System.out.println("Enter number " + (i + 1) + ": ");
            userNumbers[i] = scnr.nextDouble();
            i++;
        }


    }
}