package com.logical_statements;

import java.util.Scanner;

//WAP to print sum of it's digits using WHile loop ..? 
//input : 123 
//output : 6
public class While_loop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		
		System.out.println("The digit sum is : "+dsum(n));
		

	}
	static int dsum(int n) {
		int sum=0;
		int r=0;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		return sum;
	}

}
