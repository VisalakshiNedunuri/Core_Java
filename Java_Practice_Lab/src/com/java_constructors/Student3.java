package com.java_constructors;


//Parameterized constructors
public class Student3 {
	
	int sid;
	String sname;
	int smarks;
	
	
	//No-args Constructor
	Student3(){
		System.out.println("Constructor with no-args called");
	}
	
	//Single Parameterized constructor
	Student3(int id){
		System.out.println("Constructor with 1 arg called");
		sid=id;
	}
	
	//Double Parameterized constructor
	Student3(int id,String name){
		System.out.println("Construtor with 2 args called");
		sid=id;
		sname=name;
	}
	
	//Triple parameterized constructor
	Student3(int id,String name,int marks){
		System.out.println("Constructor with 3 args called");
		sid=id;
		sname=name;
		smarks=marks;
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Student3 s=new Student3();
		System.out.println("Student ID:"+s.sid);
		System.out.println("Student Name:"+s.sname);
		System.out.println("Student Marks:"+s.smarks);
		System.out.println("*************************************");
		Student3 s3=new Student3(1000);
		System.out.println("Student ID:"+s3.sid);
		System.out.println("Student Name:"+s3.sname);
		System.out.println("Student Marks:"+s3.smarks);
		System.out.println("*************************************");
		Student3 s1=new Student3(1001,"ram");
		System.out.println("Student ID:"+s1.sid);
		System.out.println("Student Name:"+s1.sname);
		System.out.println("Student Marks:"+s1.smarks);
		System.out.println("*************************************");
		Student3 s2=new Student3(1002,"jay",98);
		System.out.println("Student ID:"+s2.sid);
		System.out.println("Student Name:"+s2.sname);
		System.out.println("Student Marks:"+s2.smarks);
		
		
		System.out.println("main method ended");

	}

}
