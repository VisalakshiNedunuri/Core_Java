package com.java_constructors;

//copy constructor
//A copy constructor is a constructor that creates a new object by copying the values from another object of the same class.
//Java does not provide a built-in copy constructor automatically. We write one ourselves.
public class Student8 {
	int sid;
	String sname;
	
	Student8(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
		System.out.println("Normal 2 arg constructor called");
		System.out.println("Student id:"+sid);
		System.out.println("Student name:"+sname);
	}
	Student8(Student8 s8){
		this.sid=s8.sid;
		this.sname=s8.sname;
		System.out.println("Copy constructor called");
		System.out.println("Student id:"+sid);
		System.out.println("Student name:"+sname);
		
	}

	public static void main(String[] args) {
		Student8 s1=new Student8(1001,"Abc");
		Student8 s2=new Student8(s1);//copy constructor calling
		
		s2.sname="xyz";
		System.out.println("Student name:"+s1.sname);
		System.out.println("Student name:"+s2.sname);
		
		Student8 s3=s2;
		System.out.println("Student s1 name:"+s1.sname);
		System.out.println("Student s3 name:"+s3.sname);
		

	}

}
