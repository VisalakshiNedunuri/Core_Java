package com.java_constructors;

public class TaskStudent{
	
	int studentId;
	String studentName;
	int marks;
	
	

	TaskStudent() {
		System.out.println("No arg constructor called ");
		studentId=1001;
		studentName="lucky";
		marks=100;
		
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		TaskStudent t=new TaskStudent();
		t.dispalysinfo();
		System.out.println("main method ended");
	}
	void dispalysinfo() {
		System.out.println("Student id:"+studentId);
		System.out.println("Student name:"+studentName);
		System.out.println("Student marks:"+marks);
	}

}
