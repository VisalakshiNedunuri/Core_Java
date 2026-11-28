package com.logical_statements;

import java.util.Scanner;

//write a program to print whether is perfect or not
//A perfect number is a number when the sum of its factors is equal to that number except itself.
public class For_loop5 {
	static boolean isPerfect(int n) {
		boolean status=false;
		int sum=0;
		
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
			if(sum==n) {
				status=true;
			}
		}
		
		return status;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		
		boolean flag=isPerfect(n);
		
		if(flag) {
			System.out.println("It is a Perfect number");
		}else {
			System.out.println("It is not a Perfect number");
		}

	}

}
