package com.java_methods;
import java.util.Scanner;


//basic calculator with no return type and with parameters
//read input from the console
public class Calculator2 {
	
	static void Addition(int a,int b) {
		System.out.println("********************Addition for int method called*************************");
		System.out.println("Sum of two numbers : "+(a+b));
		System.out.println( );
		
	}
	static void Subtraction(int a,int b) {
		System.out.println("********************Subtraction for int method called*************************");
		System.out.println("Subtract of two numbers : "+(a-b));
		System.out.println( );
		
	}
	static void Multiplication(int a,int b) {
		System.out.println("********************Multiplication for int  method called*************************");
		System.out.println("Multiplication of two numbers : "+(a*b));
		System.out.println( );
	}
	static void Division(int a,int b) {
		System.out.println("********************Division for int  method called*************************");
		System.out.println("Division of two numbers : "+(a/b));
		System.out.println( );
		
	}
	static void Modulus(int a,int b) {
		System.out.println("********************Modulus for int method called*************************");
		System.out.println("Modulus of two numbers : "+(a%b));
		System.out.println( );
		
	}
	
	static void Addition1(float a,float b) {
		System.out.println("********************Addition for float  method called*************************");
		System.out.println("Sum of two numbers : "+(a+b));
		System.out.println( );
		
	}
	static void Subtraction1(float a,float b) {
		System.out.println("********************Subtraction for flaot method called*************************");
		System.out.println("Subtract of two numbers : "+(a-b));
		System.out.println( );
		
	}
	static void Multiplication1(float a,float b) {
		System.out.println("********************Multiplication for float  method called*************************");
		System.out.println("Multiplication of two numbers : "+(a*b));
		System.out.println( );
	}
	static void Division1(float a,float b) {
		System.out.println("********************Division for float method called*************************");
		System.out.println("Division of two numbers : "+(a/b));
		System.out.println( );
		
	}
	static void Modulus1(float a,float b) {
		System.out.println("********************Modulus for float method called*************************");
		System.out.println("Modulus of two numbers : "+(a%b));
		System.out.println( );
		
	}

	static void Addition2(byte a,byte b) {
		System.out.println("********************Addition for byte  method called*************************");
		System.out.println("Sum of two numbers : "+(a+b));
		System.out.println( );
		
	}
	static void Subtraction2(byte a,byte b) {
		System.out.println("********************Subtraction for byte method called*************************");
		System.out.println("Subtract of two numbers : "+(a-b));
		System.out.println( );
		
	}
	static void Multiplication2(byte a,byte b) {
		System.out.println("********************Multiplication for byte  method called*************************");
		System.out.println("Multiplication of two numbers : "+(a*b));
		System.out.println( );
	}
	static void Division2(byte a,byte b) {
		System.out.println("********************Division for byte method called*************************");
		System.out.println("Division of two numbers : "+(a/b));
		System.out.println( );
		
	}
	static void Modulus2(byte a,byte b) {
		System.out.println("********************Modulus for byte method called*************************");
		System.out.println("Modulus of two numbers : "+(a%b));
		System.out.println( );
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
	
		
		//For primitive int datatype 
		
		
		System.out.print("Enter int for addition : ");
		int a=sc.nextInt();
		
		System.out.print("Enter int for addition : ");
		int b=sc.nextInt();
		
		Addition(a,b);
		
		System.out.print("Enter int for subtraction : ");
		int c=sc.nextInt();
		
		System.out.print("Enter int for subtraction : ");
		int d=sc.nextInt();
		
		Subtraction(c,d);
		
		System.out.print("Enter int for multliplication : ");
		int e=sc.nextInt();
		
		System.out.print("Enter int for multliplication : ");
		int f=sc.nextInt();
		
		Multiplication(e,f);
		
		System.out.print("Enter int for division : ");
		int g=sc.nextInt();
		
		System.out.print("Enter int for division : ");
		int h=sc.nextInt();
		
		Division(g,h);
		
		
		System.out.print("Enter int for modulus : ");
		int i=sc.nextInt();
		
		System.out.print("Enter int for modulus : ");
		int j=sc.nextInt();
		
		Modulus(i,j);
		
		//for primitive  float datatype
		
		System.out.print("Enter float for addition : ");
	    float a1=sc.nextFloat();
		
		System.out.print("Enter flaot for addition : ");
		float b1=sc.nextFloat();
		
		Addition1(a1,b1);
		
		System.out.print("Enter flaot for subtraction : ");
		float c1=sc.nextFloat();
		
		System.out.print("Enter flaot for subtraction : ");
		float d1=sc.nextFloat();
		
		Subtraction1(c1,d1);
		
		System.out.print("Enter float for multliplication : ");
		float e1=sc.nextFloat();
		
		System.out.print("Enter float for multliplication : ");
		float f1=sc.nextFloat();
		
		Multiplication1(e1,f1);
		
		System.out.print("Enter float for division : ");
		float g1=sc.nextFloat();
		
		System.out.print("Enter float for division : ");
		float h1=sc.nextFloat();
		
		Division1(g1,h1);
		
		
		System.out.print("Enter float for modulus : ");
		float i1=sc.nextFloat();
		
		System.out.print("Enter float for modulus : ");
		float j1=sc.nextFloat();
		
		Modulus1(i1,j1);
		
		//for  primitive  byte  datatype
		
		System.out.print("Enter byte for addition : ");
	    byte a2=sc.nextByte();
		
		System.out.print("Enter byte for addition : ");
		byte b2=sc.nextByte();
		
		Addition1(a2,b2);
		
		System.out.print("Enter byte for subtraction : ");
		byte c2=sc.nextByte();
		
		System.out.print("Enter byte for subtraction : ");
		byte d2=sc.nextByte();
		
		Subtraction2(c2,d2);
		
		System.out.print("Enter byte for multliplication : ");
		byte e2=sc.nextByte();
		
		System.out.print("Enter byte for multliplication : ");
		byte f2=sc.nextByte();
		
		Multiplication2(e2,f2);
		
		System.out.print("Enter byte for division : ");
		byte g2=sc.nextByte();
		
		System.out.print("Enter byte for division : ");
		byte h2=sc.nextByte();
		
		Division2(g2,h2);
		
		
		System.out.print("Enter byte for modulus : ");
		byte i2=sc.nextByte();
		
		System.out.print("Enter byte for modulus : ");
		byte j2=sc.nextByte();
		
		Modulus2(i2,j2);
		
		
		
		
		
		
		
		sc.close();

	}

}
