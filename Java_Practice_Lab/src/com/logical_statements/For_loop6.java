package com.logical_statements;

import java.util.Scanner;

//Write a program to print fibanocci series upto a given number.
//0 1 1 2 3 5 8 13 21 34 55
public class For_loop6 {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println(FibNum(n));
		

	}
	static String FibNum(int n) {
		String fibnum=" ";
		int a=0;
		int b=1;
		int c=0;
		
		System.out.print("fibonacci series :"+a+" "+b);
		for(int i=0;i<n;i++) {
			c=a+b;
			fibnum=fibnum+c+" ";
			a=b;
			b=c;	
		}
		
		return fibnum;
	}

}
