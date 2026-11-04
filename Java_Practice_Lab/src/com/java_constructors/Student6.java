package com.java_constructors;

//Constructor chaining using super()
//super() is used to call a constructor in the parent class.
//parent  object is created and initialized  by implicitly  without using super() in child constructor  because of inheritance.
//then why super()?-->for calling parameterized constructors  in parent class
//while creating child object  parent object automatically creates and initializes because of inheritance.
//but while creating parent object child object does not  created and initializes automatically.
class Student6 extends Person{
	Student6(){
		System.out.println("Student no-arg constructor called");
	}
	public static void main(String[] args) {
		System.out.println("Main method  started");
		
		Student6 s=new Student6();
		Person p=new Person();
		
		System.out.println("Main method ended");
		
	}
}
class Person{
	Person(){
		System.out.println("Parent no-arg constructor called");
	}
}