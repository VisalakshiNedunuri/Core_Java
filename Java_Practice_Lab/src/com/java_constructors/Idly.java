package com.java_constructors;


//A private constructor is a constructor declared with the private access modifier.
//It prevents code outside its own class from directly calling that constructor.
//Private constructors are commonly used for three purposes.1.utility classes 2.singleton pattern 3.Factory methods
public class Idly {
	
	Idly(){
		System.out.println("No arg constructor called");
	}

	public static void main(String[] args) {
		Poori p=new Poori()//compilation error
	}

}
class Poori{
	private Poori(){
		System.out.println("Poori constructor called");
	}
	
}
