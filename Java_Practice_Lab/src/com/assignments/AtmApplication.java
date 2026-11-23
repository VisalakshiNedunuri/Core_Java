
package com.assignments;

import java.util.Scanner;

public class AtmApplication {

    static double savingsbalance = 1000;
    static double currentbalance = 1000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ATM APPLICATION =====");
        System.out.println("Enter your account type (savings/current):");

        String accountType = sc.next().toLowerCase();

        switch (accountType) {

            case "savings" -> {
                System.out.println("Welcome to Savings Account");

                int choice;

                do {
                    System.out.println("\nSavings Account Transaction Menu");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit Amount");
                    System.out.println("3. Withdraw Amount");
                    System.out.println("4. Exit");
                    
                    System.out.print("Enter your choice: ");
                    choice = sc.nextInt();

                    switch (choice) {

                        case 1:
                            System.out.println(
                                "Your current balance is: " + savingsbalance
                            );
                            break;

                        case 2:
                            System.out.print("Enter the amount to deposit: ");
                            double amount = sc.nextDouble();

                            if (amount <= 0) {
                                System.out.println("Invalid amount");
                            } else {
                                savingsbalance += amount;
                                System.out.println("Deposit successful");
                                System.out.println(
                                    "Your updated balance is: " + savingsbalance
                                );
                            }
                            break;

                        case 3:
                            System.out.print("Enter the amount to withdraw: ");
                            double amount_wd = sc.nextDouble();

                            if (amount_wd <= 0) {
                                System.out.println("Invalid amount");
                            } else if (amount_wd > savingsbalance) {
                                System.out.println("Insufficient balance");
                            } else {
                                savingsbalance -= amount_wd;
                                System.out.println("Withdrawal successful");
                                System.out.println(
                                    "Your updated balance is: " + savingsbalance
                                );
                            }
                            break;

                        case 4:
                            System.out.println("Thank you for using our ATM!");
                            break;

                        default:
                            System.out.println("Invalid choice");
                    }

                } while (choice != 4);
            }

            case "current" -> {
                System.out.println("Welcome to Current Account");

                int choice;

                do {
                    System.out.println("\nCurrent Account Transaction Menu");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit Amount");
                    System.out.println("3. Withdraw Amount");
                    System.out.println("4. Exit");
                    
                    System.out.print("Enter your choice: ");
                    choice = sc.nextInt();

                    switch (choice) {

                        case 1:
                            System.out.println(
                                "Your current balance is: " + currentbalance
                            );
                            break;

                        case 2:
                            System.out.print("Enter the amount to deposit: ");
                            double amount = sc.nextDouble();

                            if (amount <= 0) {
                                System.out.println("Invalid amount");
                            } else {
                                currentbalance += amount;
                                System.out.println("Deposit successful");
                                System.out.println(
                                    "Your updated balance is: " + currentbalance
                                );
                            }
                            break;

                        case 3:
                            System.out.print("Enter the amount to withdraw: ");
                            double amount_wd = sc.nextDouble();

                            if (amount_wd <= 0) {
                                System.out.println("Invalid amount");
                            } else if (amount_wd > currentbalance) {
                                System.out.println("Insufficient balance");
                            } else {
                                currentbalance -= amount_wd;
                                System.out.println("Withdrawal successful");
                                System.out.println(
                                    "Your updated balance is: " + currentbalance
                                );
                            }
                            break;

                        case 4:
                            System.out.println("Thank you for using our ATM!");
                            break;

                        default:
                            System.out.println("Invalid choice");
                    }

                } while (choice != 4);
            }

            default -> System.out.println("Invalid account type");
        }
    }
}

