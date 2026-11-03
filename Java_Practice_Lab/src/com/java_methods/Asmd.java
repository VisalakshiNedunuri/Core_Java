package com.java_methods;

import java.util.Scanner;

//with return type and with parameters using scanner class

public class Asmd {
	
	static Scanner sc=new Scanner(System.in);
	
	static double addition(double a,double b) {
		System.out.println("********Addition********");
		return a+b;
		
	}
	
	static double subtraction(double a,double b) {
		System.out.println("********Substraction********");
		return a-b;
	}
	
	
	static double multiplication(double a,double b) {
		System.out.println("********Multipliication********");
		return a*b;
	}
	
	static double division(double a,double b) {
		System.out.println("********Division********");
		return a/b;
	}

	public static void main(String[] args) {
		System.out.print("Enter a:  ");
		double a1=sc.nextDouble();
		System.out.print("Enter b: ");
		double b1=sc.nextDouble();
		
		
		double add=addition(a1,b1);
		System.out.println("Addition:"+add);
		double sub=subtraction(a1,b1);
		System.out.println("Subtraction:"+sub);
		double mul=multiplication(a1,b1);
		System.out.println("Multiplication:"+mul);
		double div=division(a1,b1);
		System.out.println("Division:"+div);
	}

}
