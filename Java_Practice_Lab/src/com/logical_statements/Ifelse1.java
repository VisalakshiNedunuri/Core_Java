package com.logical_statements;

import java.util.Scanner;

public class Ifelse1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Are you attending regular classes without fail??");
		boolean areYouRegularToTheClass=sc.nextBoolean();
		
		System.out.println("Are you attending weekly tests without fail??");
		boolean areYouRegularToTheWeeklyTest=sc.nextBoolean();
		
		System.out.println("Are you attending Mock Interviews without fail??");
		boolean areYouRegularForMock=sc.nextBoolean();
		
		System.out.println("Are you practicising daily without fail??");
		boolean areYouPractising=sc.nextBoolean();
		
		if(areYouRegularToTheClass && areYouRegularToTheWeeklyTest && areYouRegularForMock && areYouPractising) {
			System.out.println("you are promising job gaurentee");
			System.out.println("You will get job in 6 to 8 months 100%");
		}else {
			System.out.println("You are chearing your parents without mask");
		}
		

	}

}
