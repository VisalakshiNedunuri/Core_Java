package com.operators;

//Instance Of operator
//It is a binary operator used to check whether an object is an instance of as specific class,subclass or interface

public class InstanceOfOperaror {
	class A{
		
	}
	class B extends A{
		
	}

	public static void main(String[] args) {
		Integer i=10;
		System.out.println(i instanceof Integer);//true
		System.out.println(i instanceof Number);//true
		System.out.println(i instanceof Object);//true
		
//		System.out.println(i instanceof String);//false
		System.out.println(null instanceof Integer);//false
		
/*	    B b = new B();
		A a=new A();
//		System.out.println(b instanceof B);
	//	System.out.println(b instanceof A);
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);//false */
		
	}

}
