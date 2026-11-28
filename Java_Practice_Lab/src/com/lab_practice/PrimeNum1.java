package com.lab_practice;

import java.util.Scanner;

public class PrimeNum1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		if(isPrime(n)) {
			System.out.println("It is a prime number");
		}else {
			System.out.println("It is not a prime number");
		}
		

	}
	static boolean isPrime(int n) {
		boolean status=true;
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				status=false;
			}
		}
		return status;
	}

}

