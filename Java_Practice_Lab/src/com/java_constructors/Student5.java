package com.java_constructors;

//constructor chaining
//Constructor chaining in Java is used to call one constructor from another constructor
//so that we can reuse initialization code instead of writing the same code repeatedly.

//Constructor chaining using this()
//We can use this() to call another constructor in the same class .
public class Student5 {
	
	int sid;
	String sname;
	int marks;
	
	Student5(){
		System.out.println("No args constructor called");
		this(100);
		System.out.println("No args constructor ended");
		
	}
	Student5(int id){
		System.out.println("Single parameterized constructor");
		this.sid=id;
		this.sname="abc";
		this.marks=99;
		System.out.println("Student id:"+sid);
		System.out.println("Student id:"+sname);
		System.out.println("Student id:"+marks);
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		Student5 s=new Student5();
		
		System.out.println("main method ended");
	}

}
