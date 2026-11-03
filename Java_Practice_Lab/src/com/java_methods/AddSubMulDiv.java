package com.java_methods;

public class AddSubMulDiv {
	
	static double addition(double a,double b) {
		System.out.println("********Addition********");
		return a+b;
	}
	static double subtraction(double a,double b) {
		System.out.println("********Subtraction********");
		return a-b;
	}

	static double multiplication(double a,double b) {
		System.out.println("********Multiplication********");
		return a*b;
	}

	static double division(double a,double b) {
		System.out.println("********Division********");
		return a/b;
	}


	public static void main(String[] args) {
		double add=addition(2,3);
		System.out.println("a+b:"+add);
		
		double sub=subtraction(22,3);
		System.out.println("a-b:"+sub);
		
		double mul=multiplication(12,3);
		System.out.println("a*b:"+mul);
		
		double div=division(96,3);
		System.out.println("a/b:"+div);

	}

}
