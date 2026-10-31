package com.lab_practice;

public class IntegralLiteral {
	
	//Decimal Literal
	int a=100;
	int b=2005;
	int c=47753;
	
	//Octal Literal
	int d=0123;
	int e=04532;
	int f=0352245;
	
	//Hexadecimal Literal
	int g=0x438;
	int h=0x78365;
	int i=0x53425;
	
	//Binary Literal
	int j=0b000111;
	int k=0b10101;
	int l=0b11101110;

	public static void main(String[] args) {
		IntegralLiteral obj=new IntegralLiteral();
		
		System.out.println("Decimal Literal");
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
		System.out.println("Octal Literal");
		System.out.println(obj.d);
		System.out.println(obj.e);
		System.out.println(obj.f);
		
		System.out.println("Hexa Decimal Literal");
		System.out.println(obj.g);
		System.out.println(obj.h);
		System.out.println(obj.i);
		
		System.out.println("Binary Literal");
		System.out.println(obj.j);
		System.out.println(obj.k);
		System.out.println(obj.l);

	}

}
