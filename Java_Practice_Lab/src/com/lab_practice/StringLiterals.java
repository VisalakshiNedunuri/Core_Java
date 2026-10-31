package com.lab_practice;

public class StringLiterals {
	
	String s1="abcd";
	String s2="abcd";
	String s3="java is simple";
	String s4="1234";
	String s5=new String("java");
	String s6=new String("java");
	String s7="%*#HGfriu";
	String s8=null;//null literal	

	public static void main(String[] args) {
		StringLiterals obj=new StringLiterals();
		
		System.out.println("String Literals");
		System.out.println(obj.s1==obj.s2);
		System.out.println(obj.s5==obj.s6);
		System.out.println(obj.s2==obj.s5);
		System.out.println(obj.s4);
		System.out.println(obj.s3);
		System.out.println(obj.s7);
		System.out.println("Null Literals");
		System.out.println(obj.s8);
		obj.s8="vissu";
		System.out.println(obj.s8);
		

	}

}
