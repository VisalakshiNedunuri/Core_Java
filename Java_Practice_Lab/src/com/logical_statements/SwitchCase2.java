package com.logical_statements;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks P ");
		
		int marksP=sc.nextInt();
		
		String grade=switch(marksP/10) {
		
		case 9 ->{
			System.out.println("It's very good result");
			yield "Grade A";
		}
		case 8->{
			System.out.println("Good result:");
			yield "Grade B";
		}
		case 7->{
			System.out.println("Its okay result");
			yield "Grade C";
		}
		case 6,5,4->{
			System.out.println("Results are not good");
			yield "Grade D";
		}
		default ->{
			System.out.println("The user is failed");
			yield "Failed";
		}
		};
		System.out.println("The Grade is :"+grade);
	}

}
