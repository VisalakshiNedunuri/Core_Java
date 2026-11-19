package com.logical_statements;

import java.util.Scanner;

////Write a program to print odd number up to  given number
public class For_loop3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		System.out.print("Odd Numbers are ");
		for(int i=1;i<=n;i=i+2) {
			if(i%2 !=0 && i!=0) {
				System.out.print(" "+i);
			}
		}

	}

}
