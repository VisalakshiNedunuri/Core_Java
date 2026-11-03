package com.java_constructors;


//No args constructor
public class Student {
	
	int sid;
	String name;
	int marks;
	
	
	//No-arg constructor
	Student(){
		System.out.println("Constructor called");
		sid=1001;
		name="abcde";
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Student s=new Student();
		System.out.println("Student ID:"+s.sid);
		System.out.println("Student Name:"+s.name);
		System.out.println("Student marks:"+s.marks);//by default constructor
		
		
		System.out.println("Main method ended");

	}

}
