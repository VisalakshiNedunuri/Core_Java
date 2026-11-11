package com.operators;


//Comparison operators
// ==  != <  >  <=  >=

//== operator check the values if the data is primitive
//== operator check the addresses if the data is object type
public class ComparisonOperators {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		String s1=new String("Vissu");
		String s2=new String("vissu");
		System.out.println(s1==s2);//false-->checking addresses
		System.out.println(s1.equals(s2));//true-->checks content for object type
		System.out.println(s1.equalsIgnoreCase(s2));//true-->ignoring the case-sentisive
		
		int a=10;
		int b=20;
		int c=10;
		
		System.out.println(a==c);//true--->checking values
		System.out.println(a != c);//false
		
		System.out.println(a>b);//10>20-->false
		System.out.println(a>=b);//10>=20-->false
		
		System.out.println(a<b);//10<20-->true
		System.out.println(a<=b);//10<=20-->true
		System.out.println(a<c);//10<10-->false		
		
		System.out.println("Main method ended");

	}

}
