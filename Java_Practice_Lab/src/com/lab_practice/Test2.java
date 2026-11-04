package com.lab_practice;

public class Test2 {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("main method loaded");
		
		
	
		//Bootstrap class Loader-->It loads predefined classes 
		System.out.println(Class.forName("java.lang.Class"));
		System.out.println(Class.forName("java.lang.Object"));
		System.out.println(Class.forName("java.lang.Math"));
		
		//Application Class Loader -->It loads user defined classes
		System.out.println(Class.forName("com.lab_practice.Test1"));
		System.out.println(Class.forName("com.lab_practice.MyFirstClass"));
		
		
		//Extension Class loader --> It loads predefined extension classes
		
		System.out.println(Class.forName("javax.crypto.Cipher"));
		
		
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
		
		
		System.out.println("main method ended");
	}

}
