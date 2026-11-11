package com.operators;

//Assignment Operators
// =  +=  -=  *=  /=  %=
public class AssignmentOperators {

	public static void main(String[] args) {
		System.out.println("main method starteed");
		
		int a=10;
		System.out.println(a);
		
		//a=a+5.5;
		System.out.println(a);
		
		a=(int) (a+5.5);
		a +=5.5;//double is converting to int automatically with compount operator which += will consider this concept as Narrowing.
		System.out.println(a);
		
		//a=a-3.5;
		a-=3.5;//a=a-3.5=11.5
		System.out.println(a);//11
		
		//a=a*2.5;
		a*=2.5;//11*2.5
		System.out.println(a);//27
		
		//a=a/2.5;
		a/=2.5; // 27/2.5
		System.out.println(a);//10
		
		//a=a%1.5;
		a%=1.5; // 10%1.5
		System.out.println(a);//1
		
		double d1=a;//int can convert directly to double will ocnsider as implicit type casting or widening
		
		
		System.out.println("main method ended");
	}

}
