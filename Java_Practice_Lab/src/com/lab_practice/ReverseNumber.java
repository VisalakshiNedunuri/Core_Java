package com.lab_practice;

import java.util.Scanner;

//Write a java program to reverse a number.
//Input:12345
//output:54321
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		
		System.out.print("Reverse of a given number is:"+revnum(n));
		

	}
	static String revnum(int n) {
		String rev="";
		int r=0;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			rev=rev+r;
		}
		
		return rev;
	}

}
