package com.java_methods;


import java.util.Scanner;

public class MethodsPractice {

    static Scanner sc = new Scanner(System.in);

    // Addition method
    static void addition() {
        System.out.println("\n===== ADDITION =====");

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Addition result: " + (a + b));

        subtraction();
    }

    // Subtraction method
    static void subtraction() {
        System.out.println("\n===== SUBTRACTION =====");

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Subtraction result: " + (a - b));

        multiplication();
    }

    // Multiplication method
    static void multiplication() {
        System.out.println("\n===== MULTIPLICATION =====");

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Multiplication result: " + (a * b));

        division();
    }

    // Division method
    static void division() {
        System.out.println("\n===== DIVISION =====");

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        if (b != 0) {
            System.out.println("Division result: " + (a / b));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }

        sc.close();
    }

    public static void main(String[] args) {
        addition();  // Only one user-defined method call
    }
}
