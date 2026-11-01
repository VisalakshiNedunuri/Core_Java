package com.java_methods;

import java.util.Scanner;

public class PersonBio {
	
	
	static String firstname() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your First name: ");
		String n=sc.nextLine();
		return n;
	}
	static String lastname() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Last name: ");
		String n=sc.nextLine();
		return n;
	}
	static String fullname() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Full name: ");
		String n=sc.nextLine();
		return n;
	}
	static String mname() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Mother name: ");
		String n=sc.nextLine();
		return n;
	}
	static String fname() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Father name : ");
		String n=sc.nextLine();
		return n;
	}
	static String sname() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Sibiling name : ");
		String n=sc.nextLine();
		return n;
	}
	static String address() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter  ur Address : ");
		String n=sc.nextLine();
		return n;
	}
	static int age() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter ur Age : ");
		int n=sc.nextInt();
		return n;
	}
	static String gender() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter ur Gender : ");
		String n=sc.nextLine();
		return n;
	}
	static String hq() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Highest qualification : ");
		String n=sc.nextLine();
		return n;
	}
	static String favcolor() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your favourite colour : ");
		String n=sc.nextLine();
		return n;
	}
	static String favfood() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Favourite food: ");
		String n=sc.nextLine();
		return n;
	}
	static String favfruit() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your favourite Fruit name: ");
		String n=sc.nextLine();
		return n;
	}
	static String favvegetable() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your favourite vegetable name: ");
		String n=sc.nextLine();
		return n;
	}
	static String favsnack() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your favourite snack name: ");
		String n=sc.nextLine();
		return n;
	}
	static String favplace() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your favourite place name: ");
		String n=sc.nextLine();
		return n;
	}
	static String favpet() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your favourite pet name: ");
		String n=sc.nextLine();
		return n;
	}
	
	

	public static void main(String[] args) {
		String result=firstname();
		System.out.println("Your First name is : "+result);
		
		String result2=lastname();
		System.out.println("Your Last name is : "+result2);
		
		String result3=fullname();
		System.out.println("Your Full name is : "+result3);
		
		String result4=mname();
		System.out.println("Your Mother name is : "+result4);
		
		String result5=fname();
		System.out.println("Your Father name is : "+result5);
		
		String result6=sname();
		System.out.println("Your Full name is : "+result6);
		
		
		String result8=address();
		System.out.println("Your Address is : "+result8);
		
		int result9=age();
		System.out.println("Your age is : "+result9);
		
		String result10=gender();
		System.out.println("Your gender is : "+result10);
		
		String result11=hq();
		System.out.println("Your Highest Qualifilication is : "+result11);
		
		String result12=favcolor();
		System.out.println("Your colour is : "+result12);
		
		String result7=favfood();
		System.out.println("Your favourite food is : "+result7);
		
		
        
	}

}
