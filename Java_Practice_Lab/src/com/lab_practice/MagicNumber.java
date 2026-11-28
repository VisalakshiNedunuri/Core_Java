package com.lab_practice;

import java.util.Scanner;

//3.Write a Java program to check whether a given number is a Magic Number or not.
//input:145
//output:magic number
/*magic number:A Magic Number is a number in which we repeatedly calculate the sum of its digits until we get a single digit.
 If the final single digit is 1, then it is called a Magic Number.*/
public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		if(isMagic(n)) {
			System.out.println("It is a Magic Number");
		}else {
			System.out.println("It is not a Magic number");
		}

	}
	static boolean isMagic(int n) {
		boolean status=false;
		
		int r=0;
		int sum=0;
		
		if(n==1) {
			status=true;
		}
		
		while(n>9) {
			sum=0;
			while(n>0) {
				r=n%10;
				n=n/10;
				sum=sum+r;
			}
			n=sum;
			
			if(count_number(sum)==1 && sum==1) {
				status=true;
			}else {
				status=false;
			}
		}
		
		return status;
	}
	static int count_number(int n) {
		int count=0;
		int r=0;
		
		while(n>0) {
			r=n%10;
			count++;
			n=n/10;
		}
		
		return count;
	}

}
