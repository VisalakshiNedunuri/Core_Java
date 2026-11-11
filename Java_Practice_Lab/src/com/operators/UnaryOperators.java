package com.operators;

//Unary operators
//+ - ++ --
//pre-increment & post increment-->++
//pre-decrement & post decrement-->--
public class UnaryOperators {

	public static void main(String[] args) {
		int a=5;
		int b=6;
		
//		unary plus -->Represents positive data
		System.out.println(+a);// 5
		
//		unary minus -->Represents negative data
		System.out.println(-b);//-6
		
		System.out.println(a++);//a=a+5--->6
		
		System.out.println(++a);// 7
		
//		System.out.println(a++);//7
//		System.out.println(++a);//9
		
		System.out.println(--b);//5
		System.out.println(b--);//5-->4
		
		
		System.out.println(++a);//8
		System.out.println(a++);//8-->9
		System.out.println(++a);//10
		System.out.println(++a);//11
		System.out.println(a++);//11-->12
		System.out.println(a++);//12-->13
		System.out.println(++b);//5
		System.out.println(--b);//4
		System.out.println(--a);//12
		System.out.println(a++);//12-->13
		System.out.println(a--);//13-->12
		System.out.println(a++);//12-->13
		System.out.println(a--);//13-->12
		System.out.println(++b);//5
		
		System.out.println("A value:"+a);//12
		System.out.println("B value:"+b);//5
		
		System.out.println(++a + ++b + --a + --b);//13+6+12+5=36
		System.out.println(++a - ++b - ++a - --b );//13-6-14-5=-12
		
		
		
	}

}
