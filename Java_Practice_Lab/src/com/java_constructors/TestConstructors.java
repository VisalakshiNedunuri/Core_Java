package com.java_constructors;


//A constructor is a special member of a class used to initialize an object when the object is created.
//Default constructor
public class TestConstructors {
	
	int sid;
	String sname;
	int smarks;
	
	{
		System.out.println("Default  Constructor called");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method Started");
		TestConstructors t=new TestConstructors();
		System.out.println("Student id:"+t.sid);
		System.out.println("Student name:"+t.sname);
		System.out.println("Student marks:"+t.smarks);
		System.out.println("Main method ended");
	}

}
