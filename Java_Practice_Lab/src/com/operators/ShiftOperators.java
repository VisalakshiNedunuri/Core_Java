package com.operators;

//Shift Operators
//Left shift (<<)
//Right shift (>>)

public class ShiftOperators {

	public static void main(String[] args) {
		int a=45;
		int b=2;
		
		System.out.println(a<<b);//180
		System.out.println(a>>b);//11
		
		int c=78;
		int d=3;
		System.out.println(c<<d);//624--->left shift 
		System.out.println(c>>d);//9--->right shift
		
		System.out.println(c>>>d);//9-->signed right left operator 
	}

}
