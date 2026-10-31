package com.lab_practice;

public class Wrappercaching {
	
	Integer a=100;
	Integer b=100;
	
	Integer c=150;
	Integer d=150;
	
	

	public static void main(String[] args) {
		Wrappercaching obj=new Wrappercaching();
		System.out.println(obj.a==obj.b);
		System.out.println(obj.c==obj.d);
	}

}
