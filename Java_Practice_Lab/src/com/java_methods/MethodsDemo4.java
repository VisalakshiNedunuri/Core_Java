package com.java_methods;

//With return type and with parameters
public class MethodsDemo4 {
	
	static int method1(int a,int b) {
		System.out.println("method1 called");
		return a+b;
	}

	public static void main(String[] args) {
		int result1=method1(20,30);
		System.out.println("printing int a : "+result1);
		
	}

}
