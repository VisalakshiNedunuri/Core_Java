package com.logical_statements;

import java.util.Scanner;

//Write a program to check  the eligibility of end user for voting /driving

public class Ifelse {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
		if(age>=18) {
    		System.out.println("Congratulations");
			System.out.println("You are eligible for voting or driving!!");
		}else {
			System.out.println("Not eligible");
		}
		
/*	complie time error	
		if(age>18) 
			System.out.println("Congratulations");
		    System.out.println("You are eligible for voting or driving!!");
		else
		    System.out.println("Not eligible"); */
		
		
/*		if(age>18) 
		    System.out.println("You are eligible for voting or driving!!");
		else
		    System.out.println("Not eligible");
		    System.out.println("Congratulations");
*/
		System.out.println("Main method ended");

	}

}
