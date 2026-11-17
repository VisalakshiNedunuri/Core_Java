package com.logical_statements;

import java.util.Scanner;

public class Ifelseelif2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur age:");
		int age=sc.nextInt();
		
		if(age<0) {
			System.out.println("Invalid age");
		}else if(age>=0 && age<=5) {
			System.out.println("you are a kid");
		}else if(age>5 && age<=12) {
			System.out.println("your are children");
		}else if(age>12 && age<=19) {
			System.out.println("You are a teenager");
		}else if(age>=20 && age<=35) {
			System.out.println("yor are young");
		}else if(age>35 && age<=60) {
			System.out.println("you are middle age");
		}else if(age>60){
			System.out.println("you are senior citizen ");
		}
		

	}

}
