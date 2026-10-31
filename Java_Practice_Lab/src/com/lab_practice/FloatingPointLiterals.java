package com.lab_practice;

public class FloatingPointLiterals {

	public static void main(String[] args) {
		
		//Floating Point Literals
		
		float f1=123;
		float f2=123.45F;
		float f3=134.43f;
		float f4=0123;
		float f5=0123.45f;
		float f6=0x1234;
		float f7=0x123F;
		//float f10=0x123.23f;---->it gives compilation error because f is 15 in hexadecimal
		float f8=0b010101;
		float f9=0b010101;
		
		//Double Literals
		double d1=123;
		double d2=124.4;
		double d3=83947.3224;
		double d4=3874629093.3738d;
		double d5=0123;
		double d6=0123.45d;
		double d7=0x123d;
		//double d8=0x1234.5d;------------>it gives compilation error  because d is considered as 14 in hexadecimal
		
		System.out.println("Floating Point Literals");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);
		System.out.println(f7);
		System.out.println(f8);
		System.out.println(f9);
		System.out.println("Double Literals");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		

	}

}
