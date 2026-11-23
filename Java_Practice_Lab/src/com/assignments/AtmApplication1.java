package com.assignments;

import java.util.Scanner;

public class AtmApplication1 {
	static double balance=0;

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Account type (savings/current) : ");
		//String at=sc.next();
		checkBalance();
		depositBalance();
		withdrawAmount();

	}
	static void checkBalance() {
		System.out.println("Your current balance is "+balance);
	}
	static void depositBalance() {
		
		System.out.print("Enter the amount to deposit:");
		Scanner sc=new Scanner(System.in);
		double amount_to_deposit=sc.nextDouble();
		
		if(amount_to_deposit<=0) {
			System.out.println("Invalid amount");
		}else {
			balance=balance+amount_to_deposit;
		}
		System.out.println("Your updated balance is "+balance);
	}
	static void withdrawAmount() {
		System.out.print("Enter the amount to withdraw:");
		Scanner sc=new Scanner(System.in);
		double amount_to_withdraw=sc.nextDouble();
		
		if(amount_to_withdraw>balance || balance==0) {
			System.out.println("Insufficent amounts ");
		}else {
			balance=balance-amount_to_withdraw;
		}
		System.out.println("your Updated balance is "+balance);
	}

}
