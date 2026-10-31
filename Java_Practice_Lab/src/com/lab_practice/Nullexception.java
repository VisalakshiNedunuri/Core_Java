package com.lab_practice;

class details{
	int number=100;
	String name="abcd";
	int age=23;
	
	Address a=new Address();
	
}
 class Address{
	 String city="kakinada";
	 String state="Andhrapradesh";
 }

public class Nullexception {

	public static void main(String[] args) {
		
		details obj=new details();
		
		System.out.println(obj.number);
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.a.city);
		System.out.println(obj.a.state);

	}

}
