package com.lab_practice;

import java.util.Scanner;

public class MagicNumber3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		
		if(isMagic(n)) {
			System.out.println("It is a magic number");
		}else {
			System.out.println("It is not a magic number");
		}
	}
	static boolean isMagic(int n) {
		boolean status=false;
		
		int r=0;
		while(n>9) {
			int sum=0;
			for(int temp=n;temp>0;temp=temp/10) {
				r=temp%10;
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
