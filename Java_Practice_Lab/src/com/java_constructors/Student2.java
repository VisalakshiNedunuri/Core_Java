package com.java_constructors;


//constructor overloading problem  
//Java allows multiple constructors in the same class as long as their parameter lists differ. This is called constructor overloading.

//variable shadowing problem
//Variable shadowing occurs when a local variable or parameter has the same name as an instance variable
//so the local variable hides the instance variable within that scope.

public class Student2 {
	
	int sid;
	String sname;
	int marks;
	
	Student2(int sid){
		System.out.println("constructor with 1 arg called");
		sid=1001;
		sname="abc";
		marks=100;
		
	}
	Student2(int sid,String sname){
		System.out.println("constructor with 2 args called");
		sid=1002;
		sname="def";
		marks=99;
	}
	Student2(int sid,String sname,int marks){
		System.out.println("constructor with 3 args called");
		sid=1003;
		sname="ghi";
		marks=98;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Student2 s=new Student2(1001);
		System.out.println("Student id:"+s.sid);
		System.out.println("Student name:"+s.sname);
		System.out.println("Student marks:"+s.marks);
		
		Student2 s1=new Student2(1001,"abc");
		System.out.println("Student id:"+s1.sid);
		System.out.println("Student name:"+s1.sname);
		System.out.println("Student marks:"+s1.marks);
		
		
		Student2 s2=new Student2(1001,"abc",98);
		System.out.println("Student id:"+s2.sid);
		System.out.println("Student name:"+s2.sname);
		System.out.println("Student marks:"+s2.marks);
		
		System.out.println("main method ended");

	}

}
