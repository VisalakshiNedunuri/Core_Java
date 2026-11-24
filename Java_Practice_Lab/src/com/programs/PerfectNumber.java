package com.programs;

import java.util.Scanner;

//Print all the perfect numbers up to a given number.
//A perfect is a number where the sum of all factors of the number(Excluding itself) is equal to the given number.
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		
		System.out.print("The perfect num4bers upto given number are : ");
		for(int i=1;i<n;i++) {
			if(PerfectNum(i)) {
				System.out.print(i+" ");
			}
		}

	}
	
	static boolean PerfectNum(int n) {
		int sum=0;
		int j=1;
		
		while(j<n) {
			if(n%j==0) {
				sum +=j;
			}
			j++;
		}
		return n==sum;
	}

}
