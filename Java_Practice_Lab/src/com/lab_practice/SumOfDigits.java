package com.lab_practice;

import java.util.Scanner;

//Write a java program to find the sum of digits in a given number
//input:1234
//output:10
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		
		sod(n);

	}
	static void sod(int n) {
		int r=0;
		int  sum=0;
		
		while(n>0){
		r=n%10;
		n=n/10;
		sum=sum+r;
		}
		
		System.out.print("Sum of digits of a given number is "+sum);
	}
}
