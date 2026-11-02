package com.java_methods;

import java.util.Scanner;

public class BillingPriceSystem {
	
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method");
		
		BillingPriceSystem b=new BillingPriceSystem();
		
		double tmp=b.getMobilePriceInfo();
		double twp=b.getWatchPriceInfo();
		
		
		System.out.println("Total Bill: "+(tmp+twp));
		
		System.out.println("main ended");
	}
	double getMobilePriceInfo() {
		System.out.print("Enter ur mobile price: ");
		double mp=sc.nextDouble();
		System.out.print("Enter ur mobile quanntity: ");
		int mq=sc.nextInt();
		double tmp=mp*mq;
		return tmp;
	}
	double getWatchPriceInfo() {
		System.out.print("Enter ur watch price: ");
		double wp=sc.nextDouble();
		System.out.print("Enter ur mobile quanntity: ");
		int wq=sc.nextInt();
		double twp=wp*wq;
		return twp;
	}

}
