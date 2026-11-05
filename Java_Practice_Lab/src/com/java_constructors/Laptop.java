package com.java_constructors;

public class Laptop extends Device {
	
	String name;

    Laptop() {
    	this("Dell");
		
	}
    
    Laptop(String name){
    	super(name);
    	System.out.println("Laptop connstructor called");
    	
    }
	

	public static void main(String[] args) {
		Laptop l=new Laptop();
		
	}

}
class Device{
	Device(String name){
		System.out.println("Device name:"+name);
	}
} 