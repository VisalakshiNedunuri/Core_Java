package com.assignments;

import java.util.Scanner;

//19-11-2026
//3.Write a Java program to print the multiplication table of a given number.
public class Task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number for which table u want:");
		int n1=sc.nextInt();
		
		System.out.print("Enter how many times u want this table:");
		int n2=sc.nextInt();
		
		for(int i=1;i<=n2;i++) {
			System.out.println(n1+"  X  "+i+" = "+n1*i);
		}

	}

}
