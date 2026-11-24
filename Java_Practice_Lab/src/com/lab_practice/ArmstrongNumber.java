package com.lab_practice;

import java.util.Scanner;

//Write a java program to check whether the given number is Armstrong or not.
public class ArmstrongNumber {

	public static void m1ain(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  number:");
		int n=sc.nextInt();
		
		boolean status=isArmstrong(n);
		if(status) {
			System.out.println("It is an Armstrong number");
		}else {
			System.out.println("It is not an Armstrong number");
		}

	}
	static boolean isArmstrong(int n) {
		boolean status=false;
		String str=Integer.toString(n);
		int count=str.length();
		int original=n;
//		int count=0;
		int sum=0;
		int r=0;
		int temp=n;
/*    	while(n>0) {
			r=n%10;
			n=n/10;
			count +=1;
		}*/
		while(temp>0) {
			r=temp%10;
			temp=temp/10;
			sum=(int) (sum+Math.pow(r, count));
		}
		if(original==sum) {
			status=true;
		}
		return status;
	}
	

}
