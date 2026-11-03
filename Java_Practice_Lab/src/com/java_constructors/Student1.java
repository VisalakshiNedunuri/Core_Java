package com.java_constructors;


//Default Constructor
public class Student1 {
	
	int sid;
	String sname;
	int marks;
	
	Student1(){
		System.out.println("constructor called");
	}
	

	public static void main(String[] args) {
		System.out.println("Main method Started");
		
		Student1 s=new Student1();
		System.out.println("Student id:"+s.sid);
		System.out.println("Student name:"+s.sname);
		System.out.println("Student marks:"+s.marks);
		
		
		System.out.println("Main Method Ended");
		
	}

}
