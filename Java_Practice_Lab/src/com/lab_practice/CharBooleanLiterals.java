package com.lab_practice;

public class CharBooleanLiterals {
	//char literals
	char c1='A';
	char c2=66;
	char c3='\u0040';
	char c4='\t';
	char c5='\u004f';
	
	//boolean literals
	
	boolean b=true;
	boolean b1=false;

	public static void main(String[] args) {
		CharBooleanLiterals obj=new CharBooleanLiterals();
		
		
		System.out.println("char Literals");
		System.out.println(obj.c1);
		System.out.println(obj.c2);
		System.out.println(obj.c3);
		System.out.println(obj.c4);
		System.out.println(obj.c5);
		System.out.println("Boolean  Literals");
		System.out.println(obj.b);
		System.out.println(obj.b1);
	}

}
