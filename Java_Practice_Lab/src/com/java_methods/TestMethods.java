package com.java_methods;


import java.util.Scanner;

public class TestMethods {

    static Scanner sc = new Scanner(System.in);

    // Addition
    static double addition(double a, double b) {
        System.out.println("\n ********ADDITION *********");

        System.out.print("Enter first number: ");
        a = sc.nextDouble();

        System.out.print("Enter second number: ");
        b = sc.nextDouble();

        return a + b;
    }

    // Subtraction
    static double subtraction(double a, double b) {
        System.out.println("\n********SUBTRACTION*********");

        System.out.print("Enter first number: ");
        a = sc.nextDouble();

        System.out.print("Enter second number: ");
        b = sc.nextDouble();

        return a - b;
    }

    // Multiplication
    static double multiplication(double a, double b) {
        System.out.println("\n*********MULTIPLICATION*********");

        System.out.print("Enter first number: ");
        a = sc.nextDouble();

        System.out.print("Enter second number: ");
        b = sc.nextDouble();

        return a * b;
    }

    // Division
    static double division(double a, double b) {
        System.out.println("\n*********DIVISION**********");

        System.out.print("Enter first number: ");
        a = sc.nextDouble();

        System.out.print("Enter second number: ");
        b = sc.nextDouble();

        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }

        return a / b;
    }

    // Calls all four methods
    static double displayResults(double a, double b) {
        System.out.println("Addition result: " + addition(a, b));
        System.out.println("Subtraction result: " + subtraction(a, b));
        System.out.println("Multiplication result: " + multiplication(a, b));
        System.out.println("Division result: " + division(a, b));

        return 0;
    }

    public static void main(String[] args) {
        displayResults(0, 0);
    }
}
