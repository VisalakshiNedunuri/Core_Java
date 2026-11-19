package com.assignments;

import java.util.Scanner;

//19-11-2026
//4.Write a Java program to print all factors of a given number.
public class Task4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a  number:");
		int n=sc.nextInt();
		
		System.out.print("The factors of "+n+" are ");
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(" "+i);
			}
		}

	}

}
