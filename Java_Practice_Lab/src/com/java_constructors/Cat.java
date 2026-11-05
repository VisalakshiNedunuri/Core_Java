package com.java_constructors;

//constructor chaining with three classes

public class Cat extends Animals {
	
	Cat(){
		this("Kitty");
	}
	Cat(String name){
		super("Animal");
		System.out.println("Cats name:"+name);
	}

	public static void main(String[] args) {
		Cat c=new Cat();

	}

}
class Animals extends LivingThing{
	Animals(String category){
		super(category);
		System.out.println("Animal constructor");
	}
}

class LivingThing{
	LivingThing(String category){
		System.out.println("Living thing:"+category);
	}
}
