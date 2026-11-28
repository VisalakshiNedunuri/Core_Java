package com.logical_statements;

import java.util.Scanner;

//Write a program to print upto n prime numbers.
//A number which is divisible by itself and 1 is a prime number.
public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
			
		}
		

	}
	static boolean isPrime(int n) {
		boolean status=true;
		
		if(n==0||n==1) {
			return false;
		}
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				status=false;
				break;
			}
		}
		
		return status;
	}

}
