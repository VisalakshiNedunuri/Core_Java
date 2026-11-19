package com.logical_statements;

import java.util.Scanner;

//Electricity Bill
public class ElectricityBill {
	
	static int domesticBillPerUnit=5;
	static int commercialBillPerUnit=8;
	static int industrialBillPerUnit=10;
	
	static double totalBill=0;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the customer type (domestic/commercial/industrial):");
		String ct=sc.next();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the no of electricity units consumed:");
		double eu=sc1.nextDouble();
		
		switch(ct) {
		case "domestic" -> totalBill= domesticBillPerUnit * eu;
		case "commercial" -> totalBill=commercialBillPerUnit * eu;
		case "industrial" -> totalBill=industrialBillPerUnit * eu;
		default->System.out.println("Invalid customer type");
		}
		
		System.out.println("Total Bill = "+totalBill);

	}

}













