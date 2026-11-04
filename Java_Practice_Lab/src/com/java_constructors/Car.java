package com.java_constructors;

public class Car extends  Vehicle{
	int price;
	
	Car(String brand,int price){
		super(brand);
		System.out.println("Child constructor called");
		this.brand=brand;
		this.price=price;
		//System.out.println("Vehicle brand:"+brand);
		System.out.println("Car price:"+price);
	}

	public static void main(String[] args) {
		Car c = new Car("Toyota", 1500000);

	}

}

class Vehicle{
	String brand;
	Vehicle(String brand){
		System.out.println("Parent constructor called");
		this.brand=brand;
		System.out.println("Vehicle brand:"+brand);
	}
}