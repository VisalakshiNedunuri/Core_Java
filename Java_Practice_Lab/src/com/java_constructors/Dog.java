package com.java_constructors;

public class Dog extends Animal {
	String type;
	
	Dog(){
		this("puppy");
	}
	Dog(String type){
		super(type);
		System.out.println("Dog constructor called");
	}

	public static void main(String[] args) {
		Dog d=new Dog();

	}

}
class Animal{
	Animal(String type){
		System.out.println("Animal:"+type);
	}
}
