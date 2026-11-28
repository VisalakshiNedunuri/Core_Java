package com.lab_practice;

import java.util.Scanner;

//1.Write a Java program to check whether a given number is a palindrome or not.
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter a  number:");
		int n=sc.nextInt();
		
		if(isPalindrome(n)) {
			System.out.println("It is Palindrome");
		}else {
			System.out.println("It is not Palindrome");
		}

	}
	static boolean isPalindrome(int n) {
		boolean status=false;
		
		String rev="";
		int r=0;
		String temp=Integer.toString(n);
		
		while(n>0) {
			r=n%10;
			n=n/10;
			
			rev=rev+r;
		}
		if(temp.equals(rev)) {
			status=true;
		}
		return status;
	}

}
