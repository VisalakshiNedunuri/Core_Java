package com.assignments;


//19-11-2026
//1.Write a Java program to print all even numbers between 1 and 50.
public class Task1 {

	public static void main(String[] args) {
		System.out.println("Even numbers of 50 are ");
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				System.out.print(" "+i);
			}
		}

	}

}
