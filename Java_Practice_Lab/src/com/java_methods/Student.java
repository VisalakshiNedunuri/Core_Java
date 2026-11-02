package com.java_methods;

import java.util.Scanner;

public class Student {
	
	Scanner sc=new Scanner(System.in);
	
	double total;
	int marks;
	int nof=3;
	
	
	//without return and with parameters
	void studInfo(String s,int id) {
		System.out.println("Student Name: "+s);
		System.out.println("Student Id: "+id);
	}
	
	
	//with return and without parameters
	int totalMarks() {
		System.out.print("Enter ur marks for maths: ");
		int maths=sc.nextInt();
		System.out.print("Enter ur marks for physics: ");
		int physics=sc.nextInt();
		System.out.print("Enter ur marks for chemistry: ");
		int chemistry=sc.nextInt();
		
		return (int) (total=(double)(maths+physics+chemistry));
	}
	
	//without return and without parameters
	void avgMarks() {
		//totalMarks();
		double avg=total/nof;
		System.out.println("Average Marks: "+avg);
	}
	
	

	public static void main(String[] args) {
		Student s=new Student();
		
		s.studInfo("vissu",123);
		
		System.out.println("******************Total Marks************************************");
		int total_marks=s.totalMarks();
		System.out.println("Student Total Marks: "+total_marks);
		
		System.out.println("************************Average Marks**************************************************");
		s.avgMarks();

	}

}
