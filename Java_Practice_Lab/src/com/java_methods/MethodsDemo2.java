package com.java_methods;

//No return type and With Parameters
public class MethodsDemo2 {
	
	
	static void method1(int a,int b) {
		System.out.println("method1 called");
		System.out.println("sum of two ints:"+(a+b));
	}
	
	static void method2(int a,int b,int c) {
		System.out.println("method2 called");
		System.out.println("sum of three ints:"+(a+b+c));
	}
	
	
	
	static void method3(float a,float b){
		System.out.println("method3 called");
		System.out.println("sum of two flaots:"+(a+b));
	}
	
	static void method4(float a,float b,float c) {
		System.out.println("method4 called");
		System.out.println("sum of two floats:"+(a+b+c));
	}
	
	
	
	static void method5(double a,double b) {
		System.out.println("method5 called");
		System.out.println("sum of two double:"+(a+b));
	}
	
	static void method6(double a,double b,double c) {
		System.out.println("method6 called");
		System.out.println("sum of three double :"+(a+b+c));
	}
	
	
	
	static void method7(byte a,byte b){
		System.out.println("method7 called");
		System.out.println("sum of two byte:"+(a+b));
	}
	
	static void method8(byte a,byte b,byte c) {
		System.out.println("method8 called");
		System.out.println("sum of three byte:"+(a+b+c));
	}	
	
	
	
	static void method9(short a,short b) {
		System.out.println("method9 called");
		System.out.println("sum of two short :"+(a+b));
	}
	
	static void method10(short a,short b,short c) {
		System.out.println("method10 called");
		System.out.println("sum of three short:"+(a+b+c));
	}	
	
	
	
	static void method11(long a,long b) {
		System.out.println("method11 called");
		System.out.println("sum of two long:"+(a+b));
	}
	
	static void method12(long a,long b,long c) {
		System.out.println("method12 called");
		System.out.println("sum of three long:"+(a+b+c));
	}	
	
	static void method13(char a,char b) {
		System.out.println("method13 called");
		System.out.println("sum of two chars:"+(a+b));
	}
	
	static void method14(char a,char b,char c) {
		System.out.println("method14 called");
		System.out.println("sum of three chars:"+(a+b+c));
	}	
	
	static void method15(boolean a) {
		System.out.println("method13 called");
		System.out.println("Printing boolean true:"+a);
	}
	
	static void method16(boolean a) {
		System.out.println("method16 called");
		System.out.println("printing boolean false:"+a);
	}	
	
	static void method17(String a) {
		System.out.println("method17 called");
		System.out.println("printing string:"+a);
	}	
	
	static void method18(String a,String b) {
		System.out.println("method18 called");
		System.out.println("sum of two strings:"+(a+b));
	}	
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		method1(2,3);
		method2(2,3,4);
		method3(1,2);
//      method3(2.5,2.5);--->error:The method method3(float, float) in the type MethodsDemo2 is not applicable for the arguments (double, double)
		method4(1,2,3);
//		method4(1.0,2.0,3.0);-->error:The method method4(float, float, float) in the type MethodsDemo2 is not applicable for the arguments (double, double, double)
		method4(1,2,3);
		method5(1,2);
		method5(1.2,1.4);
		method6(1,2,3);
		method6(1.5,1.5,1.5);
		method7((byte)1,(byte)2);
		method8((byte)1,(byte)2,(byte)4);
		method9((short)1,(short)2);
		method10((short)1,(short)2,(short)3);
		method11(1,2);
		method12(1,2,3);
		method13('A','B');//adding the ASCII values of chars
		method14('a','b','c');
		method15(true);
		method16(false);
		method17("abc");
		method18("abc","def");
		System.out.println("main method ended");

	}

}
