package com.logical_statements;

import java.util.Scanner;

//Write a Program related to matrimonial management:(Proof of contact)
public class NestedIfElse {

	public static void main(String[] args) {
		System.out.println("Welcome to Matrimonial Site:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String fullname=sc.nextLine();
		
		System.out.println("oh !! Nice to meet u mr/ms "+fullname);
		
		System.out.println("Enter your assets information:");
		double assets=sc.nextDouble();
		
		if(assets>=50000000.00) {
			System.out.println("oh okay");
			System.out.println("lets continue.........");
			
			System.out.println("Enter your salary:");
			double salary=sc.nextDouble();
			
			if(salary>=2500000.00) {
				System.out.println("nice lets coninue----------");
				
				System.out.println("Enter your age:");
				int age=sc.nextInt();
				if(age>=25 && age<=29) {
					System.out.println("Okat good to go");
					
					System.out.println("Enter ur height and weight :");
					float height = sc.nextFloat();
					double weight = sc.nextDouble();
					
					if((height>=5.5 && height<=6.1) && (weight>=6.5 && weight<=72)) {
						System.out.println("nice to hear the details about your ,lets continuee......... ");
						
						System.out.println("Do u have sibilings:");
						boolean sibStatus=sc.nextBoolean();
						
						if(!sibStatus) {
							System.out.println("ufff happy to hear");
							System.out.println("will connect later will take all the info");
						}else {
							System.out.println("Oh my god");
						}
						
						}else {
							System.out.println("Sorryyyy");
					}
				}else {
					System.out.println("you must need to gym");
				}
				
			}else {
				System.out.println("your profile not matching");
			}
		}
		

	}

}
