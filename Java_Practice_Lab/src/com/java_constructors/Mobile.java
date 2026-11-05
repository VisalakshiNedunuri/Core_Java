package com.java_constructors;


//An instance initializer block executes once per object, before that object's constructor body.
public class Mobile {
	String brand;
	
	{
		System.out.println("Instance block executed");
	}
	Mobile(){
		System.out.println("Constructor executed");
	}
	Mobile(String brand){
		this.brand=brand;
		System.out.println("Brand:"+brand);
	}

	public static void main(String[] args) {
		Mobile m=new Mobile();
		Mobile m1=new Mobile("vivo");

	}

}
