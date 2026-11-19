package com.logical_statements;

import java.util.Scanner;

//Write a program to print all factors of any given number
public class For_loop4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		
		System.out.print("Factors of "+ n+" are");
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(" "+i);
			}
		}

	}

}
