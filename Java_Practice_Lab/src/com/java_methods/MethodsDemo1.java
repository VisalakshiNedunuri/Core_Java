package com.java_methods;

//No return type and No Parameters

public class MethodsDemo1 {
	
	static void method1() {
		int  a=10;
		int b=100;
		System.out.println("method1 called");
		System.out.println("substraction of two numbers:"+(b-a));
	}
	
	static void method2() {
		System.out.println("method2 called");
	}
	
	static void method3() {
		System.out.println("method3 called:");
		int a=10;
		int b=20;
		System.out.println("sum of two numbers:"+a+b);
		System.out.println("sum of two numbers:"+(a+b));
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		method1();
		method2();
		method3();
		
		System.out.println("main method ended");
	}

}
