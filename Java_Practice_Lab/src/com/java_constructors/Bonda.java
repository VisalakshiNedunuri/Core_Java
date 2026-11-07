package com.java_constructors;

//the private constructor can be called from inside the class itself.
public class Bonda {
	
	private Bonda() {
		System.out.println("Bonda constructor called");
	}

	public static void main(String[] args) {
		Bonda b=new Bonda();

	}

}
class Chutney{
	Chutney(){
		System.out.println("Chutney constructor called");
	}
}
