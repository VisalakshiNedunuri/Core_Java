package com.java_constructors;


//super() calls the parent’s no-argument constructor.
//super(value) calls a matching parameterized parent constructor.

public class WashingMachine extends Appliance {
	//String type;
	WashingMachine(String type){
		//super();
		super(type);
		System.out.println("WashingMachine constructor called");
		
	}

	public static void main(String[] args) {
		WashingMachine w = new WashingMachine("Automatic");
	}

}
class Appliance{
	
	Appliance(){
		System.out.println("Appliance default constructor");	
	}
	Appliance(String type){
		System.out.println("Appliance parameterized constructor");
		System.out.println("Appliance type:"+type);	
	}
}