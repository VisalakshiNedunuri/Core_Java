package com.lab_practice;

import java.util.Scanner;

public class MagicNumber1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		if(isMagic(n)) {
			System.out.println("It is a Magic number");
		}else {
			System.out.println("It is not a Magic number");
		}

	}
	static boolean isMagic(int  n) {
		boolean status=false;
		int r=0;

		while(n>9) {
			int sum=0;
			while(n>0) {
				r=n%10; 
				n=n/10;
				sum+=r;
			}
			n=sum;
		}
		if(n==1) {
			status=true;
		}
		return status;
	}

}
