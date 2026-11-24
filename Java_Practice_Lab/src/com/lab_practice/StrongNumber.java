package com.lab_practice;
import java.util.Scanner;

//Write a program to check whether the  given number is  Strong or not.
//input:145
//output:yes
public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		boolean status=isStrongNum(n);
		if(status) {
			System.out.println("It is a Strong number");
		}else {
			System.out.println("It is not a Strong number");
		}

	}
	static boolean isStrongNum(int n) {
		boolean status=false;
		if (n <= 0) return false;
		int r=0;
		int sum=0;
		int original=n;
		
		while(n>0) {
			r=n%10;
			sum+=factorial(r);
			n=n/10;
		}
		if(sum==original) {
			status=true;
		}
		return status;
	}
	
	static int factorial(int num) {
		int fact=1;
		
		for(int i=2;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
		
	}
	

}
