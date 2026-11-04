package com.lab_practice;

public class Test4 {
	static int a=20;
	int b=30;
	static String c="abc";
	String d="xyz";
	
	static void display1(){
		System.out.println("This is first static block data:"+a);
	}
	static void display2(){
		System.out.println("This is Second static block data:"+c);
	}
	void display3(){
		System.out.println("This is First instance block data:"+b);
	}
	void display4(){
		System.out.println("This is second instance block data:"+d);
	}

	public static void main(String[] args) {
		Test4 obj= new Test4();
		display1();
		display2();
		obj.display3();
		obj.display4();

	}
	
}
