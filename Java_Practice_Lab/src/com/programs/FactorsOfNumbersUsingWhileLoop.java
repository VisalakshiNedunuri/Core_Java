package com.programs;

import java.util.Scanner;

public class FactorsOfNumbersUsingWhileLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		
		Factors(n);

	}
	static void Factors(int n) {
		int  i=1;
		System.out.print("Factors of a number are ");
		while(i<=n) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		i++;
		}
	}

}
