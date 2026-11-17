package com.logical_statements;

import java.util.Scanner;

//Write a program to print cricketer details based on jersey number.
public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter jersey number: ");
		
		int jno=sc.nextInt();
		
		
		switch(jno) {
		case 7:
			System.out.println("Mahendra Singh  Dhoni");
			System.out.println("cool Indian cricketer captain");
			System.out.println("Thala for a reason");
			break;
		case 18:
			System.out.println("virat kohli");
			System.out.println("Aggressive cricketer");
			System.out.println("Goat");
			break;
		case 45:
			System.out.println("Rohit sharma");
			System.out.println("Hit batsman");
			System.out.println("Hitman");
			break;
		default:
			System.out.println("Entered jersey number not available:");
		}	

	}

}
