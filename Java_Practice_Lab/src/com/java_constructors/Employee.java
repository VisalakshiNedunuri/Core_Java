package com.java_constructors;

public class Employee {
	
	int eid;
	String ename;
	double esalary;
	
	Employee(int id){
		System.out.println("1-arg Parameterized constructor called");
		eid=id;
		
	}
	Employee(int id,String name){
		System.out.println("2-arg Parameterized constructor called");
		eid=id;
		ename=name;
		
	}
	Employee(int id,String name,double salary){
		System.out.println("3-arg Parameterized constructor called");
		eid=id;
		ename=name;
		esalary=salary;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		System.out.println("***********************************");
		
		Employee e=new Employee(10001);
		e.displayeinfo();
		
		System.out.println("***********************************");
		
		Employee e1=new Employee(10002,"abcd");
		e1.displayeinfo();
		
		System.out.println("***********************************");
		
		Employee e2=new Employee(10003,"efgh",500000.00);
		e2.displayeinfo();
		
		System.out.println("***********************************");
		
		System.out.println("main method ended");

	}
	
	void displayeinfo() {
		System.out.println("Employee id:"+eid);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee salary:"+esalary);
	}

}
