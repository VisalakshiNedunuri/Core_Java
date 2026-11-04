package com.java_constructors;

public class Student7 extends Person1 {
	
	Student7(){
		super("Ram");
		System.out.println("Child 1-arg parameterized constructor");
	}
	

	public static void main(String[] args) {
		Student7 s=new Student7();
		System.out.println(s.pname);

	}

}
class Person1{
	String pname;
	Person1(String name){
		System.out.println("Parent 1-arg parameterized constructor");
		pname=name;
		System.out.println("Person Name:"+pname);
	}
}