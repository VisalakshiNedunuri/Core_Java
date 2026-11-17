package com.logical_statements;

import java.util.Scanner;

//Write a program to print the grade based on the marks percentage
public class Ifelseelif {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks Percentage:");
		double marksP=sc.nextDouble();
		
		if(marksP>100 || marksP<0) {
			System.out.println("Invalid Marks");
		}else if(marksP>=90) {
			System.out.println("Grade A");
		}else if(marksP>=80) {
			System.out.println("Grade B");
		}else if(marksP>=70) {
			System.out.println("Grade C");
		}else if(marksP>=60) {
			System.out.println("Grade D");
		}else if(marksP>=35) {
			System.out.println("Just Passed");
		}else {
			System.out.println("Failed");
		}
		

	}

}
