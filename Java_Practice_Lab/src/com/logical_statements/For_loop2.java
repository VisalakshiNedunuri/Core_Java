package com.logical_statements;

import java.util.Scanner;

//Write a program to print even number up to  given number
public class For_loop2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		
		System.out.print("Even numbers are ");
		for(int i=0;i<=n;i=i+2) {
			if(i%2==0 && i!=0) {
				System.out.print(" "+i);
			}
		}

	}

}
