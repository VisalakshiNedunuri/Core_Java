package com.lab_practice;

public class Student {
	
	int student_id;
	String student_name;
	String course_name;
	int marks;
	static  String college_name="abcde";
	static String principal_name="murthy";
	
	void displayStudentDetails(){
		Student s1= new Student();
		s1.student_id=1;
		s1.student_name="uma";
		s1.course_name="java";
		s1.marks=100;
		System.out.println("STUDENT DETAILS:");
		System.out.println("Student ID:"+s1.student_id);
		System.out.println("Student Name:"+s1.student_name);
		System.out.println("Student Course:"+s1.course_name);
		System.out.println("Student Marks:"+s1.marks);
		System.out.println();
	}
	
	void displayCollegeDetails(){
		System.out.println("COLLEGE DETAILS:");
		System.out.println("College Name:"+college_name);
		System.out.println("Principal Name:"+principal_name);
		System.out.println();
	}
	
	void changePrincipal(){
		System.out.println("CHANGING PRINCIPAL NAME:");
		System.out.println("Before Changing:"+principal_name);
		principal_name="lakshman rao";
		System.out.println("After Changing:"+principal_name);
	
	}


	public static void main(String[] args) {
		Student s2 = new Student();
		s2.displayStudentDetails();
		s2.displayCollegeDetails();
		s2.changePrincipal();
	}

}
