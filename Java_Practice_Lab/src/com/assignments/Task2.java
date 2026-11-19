package com.assignments;

//19-11-2026
//2.Write a Java program to find the sum of numbers from 1 to 100.
public class Task2 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			sum=sum+i;
		}
		System.out.println("The sum of numbers from 1 to 100 is "+sum);
	}

}
