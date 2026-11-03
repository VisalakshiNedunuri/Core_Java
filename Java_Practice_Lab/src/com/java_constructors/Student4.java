package com.java_constructors;


//In Java, the this keyword refers to the current object.
//this is a keyword to invoke current class Object data members.
//When the parameter and instance variable have the same name, this helps Java distinguish them.

//Until Java 24 version ,this() or super must be first line of any Constructor.
//But, After 25 onwards, this() & super() can written any where in the constructor based on Requirements.
public class Student4 {
	int sid;
	String sname;
	int marks;
	
	Student4(int sid){
		System.out.println("constructor with 1 arg called");
		this.sid=sid;
	}
	Student4(int sid,String sname){
		System.out.println("constructor with 2 args called");
		this.sid=sid;
		this.sname=sname;
	}
	Student4(int sid,String sname,int marks){
		System.out.println("constructor with 3 args called");
		this.sid=sid;
		this.sname=sname;
		this.marks=marks;
	}

	public static void main(String[] args) {
        System.out.println("main method started");
		
		Student4 s=new Student4(1001);
		System.out.println("Student id:"+s.sid);
		System.out.println("Student name:"+s.sname);
		System.out.println("Student marks:"+s.marks);
		
		System.out.println("*************************************");
		
		Student4 s1=new Student4(1001,"abc");
		System.out.println("Student id:"+s1.sid);
		System.out.println("Student name:"+s1.sname);
		System.out.println("Student marks:"+s1.marks);
		
		System.out.println("*************************************");
		
		Student4 s2=new Student4(1001,"abc",98);
		System.out.println("Student id:"+s2.sid);
		System.out.println("Student name:"+s2.sname);
		System.out.println("Student marks:"+s2.marks);
		
		System.out.println("main method ended");


	}

}
