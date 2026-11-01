package com.java_methods;

//basic calculator with no return type with arguments
public class Calculator {
	static void addition(int a,int b) {
		System.out.println("Addition Operation called");
		System.out.println("a + b="+(a+b));
	}
	
	static void subtraction(int a,int b) {
		System.out.println("Subtraction operation called");
		System.out.println("a - b="+(a-b));
	}
	static void multiplication(int a,int b) {
		System.out.println("Multiplication operation called");
		System.out.println("a * b="+(a*b));
	}
	static void division(int a,int b) {
		System.out.println("Division operation called" );
		System.out.println("a / b="+(a/b));
	}
	static void modulus(int a,int b) {
		System.out.println("Modulus operation called");
		System.out.println("a % b="+(a%b));
	}
	
	

	public static void main(String[] args) {
		addition(200,300);
		subtraction(300,250);
		multiplication(10,10);
		division(200,100);
		modulus(20,4);

	}

}
