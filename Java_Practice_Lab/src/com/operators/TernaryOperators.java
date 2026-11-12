package com.operators;

import java.util.Scanner;

//Ternary Operator
//syntax: (condition)?value1:value2;
public class TernaryOperators {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur age:");
		int age=sc.nextInt();
		
		int a=10;
		int b=20;
		int c=30;
		int max=(a>b)?a:b;
		System.out.println("Max value :"+max);
		
		int max1=(a>b && a>c)?a:(b>c)?b:c;
		System.out.println("Max value :"+max1);
		
		String isEligible =(age>18)?"yes":"no";
		System.out.println("Is the person is eligible for voting:"+isEligible);

	}

}
