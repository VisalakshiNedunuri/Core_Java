package com.logical_statements;

import java.util.Scanner;

public class digitsCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		
		System.out.println("No of digits are :"+dcount(n));
		

	}
	static int dcount(int n) {
		int count=0;
		int r=0;
		
		while(n>0) {
			r=n%10;
			count++;
			n=n/10;
			
		}
		return count;
	}

}
