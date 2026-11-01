package com.java_methods;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ScannerClassPractice {
	
	static void method1() {
        Scanner sc=new Scanner(System.in);
		
		
		//Primitive DataTypes
		
		System.out.print("Enter byte value: ");
		byte a=sc.nextByte();
		System.out.println("printing byte value : "+a);
		
		System.out.print("Enter short value: ");
		short b=sc.nextShort();
		System.out.println("printing short value : "+b);
		
		System.out.print("Enter int value: ");
		int c=sc.nextInt();
		System.out.println("printing int value : "+c);
		
		System.out.print("Enter long value: ");
		long d=sc.nextLong();
		System.out.println("printing long value : "+d);
		
		System.out.print("Enter float value: ");
		float e=sc.nextFloat();
		System.out.println("printing float value : "+e);
		
		System.out.print("Enter double value: ");
		double f=sc.nextDouble();
		System.out.println("printing double value : "+f);
		
		System.out.print("Enter char value: ");
		char g=sc.next().charAt(0);
		System.out.println("printing char value : "+g);
		
		System.out.print("Enter boolean value: ");
		boolean h=sc.nextBoolean();
		System.out.println("printing boolean value : "+h);
		
	}
	
	static void method2() {
		Scanner sc=new Scanner(System.in);
		
		/*Wrapper Object DataTypes*/
		
		System.out.print("Enter Byte value: ");
		Byte a=sc.nextByte();
		System.out.println("printing Byte value : "+a);
		
		System.out.print("Enter Short value: ");
		Short b=sc.nextShort();
		System.out.println("printing Short value : "+b);
		
		System.out.print("Enter Integer value: ");
		Integer c=sc.nextInt();
		System.out.println("printing Integer value : "+c);
		
		System.out.print("Enter Long value: ");
		Long d=sc.nextLong();
		System.out.println("printing Long value : "+d);
		
		System.out.print("Enter Float value: ");
		Float e=sc.nextFloat();
		System.out.println("printing Float value : "+e);
		
		System.out.print("Enter Double value: ");
		Double f=sc.nextDouble();
		System.out.println("printing Double value : "+f);
		
		System.out.print("Enter Character value: ");
		Character g=sc.next().charAt(0);
		System.out.println("printing Character value : "+g);
		
		System.out.print("Enter Boolean value: ");
		Boolean h=sc.nextBoolean();
		System.out.println("printing Boolean value : "+h);
		
	}
	
	static void method3() {
		Scanner sc=new Scanner(System.in);
		
		/*predefined normal Object DataTypes*/
		
		System.out.print("Enter String value: ");
		String a=sc.next();//used for only single string
		System.out.println("printing String value : "+a);
		sc.nextLine(); 
		System.out.print("Enter String with spaces value: ");
		String b=sc.nextLine();//used for string with spaces
		System.out.println("printing String with spaces value : "+b);
		
		System.out.print("Enter String for String Buffer: ");
		String c=sc.nextLine();
		StringBuffer sb=new StringBuffer(c);
		System.out.println("printing StringBuffer value : "+sb);
		
		System.out.print("Enter BigInteger value: ");
	    BigInteger d=sc.nextBigInteger();
		System.out.println("printing BigInteger value : "+d);
		
		System.out.print("Enter BigDecimal value: ");
	    BigDecimal e=sc.nextBigDecimal();
		System.out.println("printing BigDecimal value : "+e);
		
	
	}
	

	public static void main(String[] args) {
		
		
		method1();
		method2();
		method3();

	}

}
