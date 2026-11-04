package com.java_constructors;

public class Employee1 extends Person2 {
	
	int eid;
	String ename;
	
	Employee1(int eid,String ename){
		super("Ravi");
		System.out.println("***********************");
		System.out.println("child 2 arg constructor called");
		System.out.println("Employee id:"+eid);
		System.out.println("Employee name:"+ename);
		
		System.out.println("**********without using this");
		System.out.println("Instance eid:" + this.eid);
		System.out.println("Instance ename:" + this.ename);
		
		System.out.println("**********After using this");
		this.eid=eid;
		this.ename=ename;
		
		
	}
	public static void main(String[] args) {
		Employee1 e=new Employee1(101,"pinky");

		System.out.println("Employee id:"+e.eid);//instance variables so 0 printed
		System.out.println("Employee name:"+e.ename);//instance variable so null printed
		
		System.out.println("***********************");
		System.out.println("Person name:"+e.pname); //child accessing parent object
		

	}

}
class Person2{
	String pname;
	Person2(String pname){
		System.out.println("Parent  2-arg constructor called");
		System.out.println("Person name:"+pname);
		this.pname=pname;
	}
}
