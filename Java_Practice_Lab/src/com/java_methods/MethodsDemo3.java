package com.java_methods;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

//with return type and no parameters

public class MethodsDemo3 {
	
	
	/*Primitive Data types*/
	
	static int method1() {
		
		System.out.println("*********************method1 called");
		int a=10;
		int b=20;
		int sum=a+b;	
		return sum;
		
	}
	
	static int method2() {
		System.out.println("*********************method2 called");
		int a,b,sum;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a:");
			a=sc.nextInt();
			System.out.print("Enter b:");
			b=sc.nextInt();
		}
		sum=a+b;
		return sum;
		
	}
	
	static float method3() {
		System.out.println("************************method3 called");
		float f1=12.5f;
		float f2=0.5f;
		return f1+f2;
	}
	
	static byte method4() {
		System.out.println("************************method4 called");
		byte a=12;
		byte b=4;
		return (byte) ((byte)a+b);
	}
	
	static short method5() {
		System.out.println("************************method5 called");
		short a=12;
		short b=4;
		return (short) ((short)a+b);
	}
	
	static double method6() {
		System.out.println("************************method6 called");
		double a=12.43434244442424;
		double b=443.4353647687866;
		return a+b;
	}
	static char method7() {
		System.out.println("************************method7 called");
		char a='A';
		return a;
	}
	
	static boolean method8() {
		System.out.println("************************method8 called");
		boolean a=true;
		return a;
	}
	
	/*Normal object data types*/
	
	static String method9() {
		System.out.println("************************method9 called");
		String a="java is simple";
		return a;
	}
	static StringBuffer method10() {
		System.out.println("************************method10 called");
		StringBuffer a=new StringBuffer("javadb oiigjidgjddjnn");
		a=a.append("is simpleeeeeeeeeeeeeeeeee");
		return a;
	}
	static BigInteger method11() {
		System.out.println("************************method11 called");
		BigInteger a= new BigInteger("23243354355333333333333545");
		return a;
	}
	static BigDecimal method12() {
		System.out.println("************************method12 called");
		BigDecimal a=new BigDecimal("1232445465656544.65657687685674");
		return a;
	}
	
    /*wrapper object datatypes*/
	
	static Byte method13() {
		System.out.println("************************method13 called");
		Byte a=(byte) 123;
		return a;
	}
	static Short method14() {
		System.out.println("************************method14 called");
		Short a=(short) 32354;
		return a;
	}
	static Integer method15() {
		System.out.println("************************method15 called");
		Integer a=123244546;
		return a;
	}
	static Long method16() {
		System.out.println("************************method16 called");
		Long a=1565477565585764444L;
		return a;
	}
	static Float method17() {
		System.out.println("************************method17 called");
		Float a=232.65657687685674f;
		return a;
	}
	static Double method18() {
		System.out.println("************************method18 called");
		Double a=1232445465656544.65657687685674d;
		return a;
	}
	static Character method19() {
		System.out.println("************************method19 called");
		Character a='A';
		return a;
	}
	static Boolean method20() {
		System.out.println("************************method20 called");
		Boolean a=true;
		return a;
	}
	



	public static void main(String[] args) {
		
		  int result1 = method1();
		  System.out.println("Sum from method1: " + result1);

		  int result2 = method2();
		  System.out.println("Sum from method2: " + result2);
		  
		  float result3=method3();
		  System.out.println("sum of floats: "+result3);
		  
		  byte result4=method4();
		  System.out.println("sum of bytes: "+result4);
		
		  short result5=method5();
		  System.out.println("sum of shorts: "+result5);
		  
		  double result6=method6();
		  System.out.println("sum of double: "+result6);
		  
		  char result7=method7();
		  System.out.println("Printing char: "+result7);
		  
		  boolean result8=method8();
		  System.out.println("Printing boolean: "+result8);
		  

		  String result9=method9();
		  System.out.println("Printing String: "+result9);

		  StringBuffer result10=method10();
		  System.out.println("Printing StringBuffer: "+result10);

		  BigInteger result11=method11();
		  System.out.println("Printing BigInteger: "+result11);
		  

		  BigDecimal result12=method12();
		  System.out.println("Printing BigDecimal: "+result12);
	
		  Byte result13=method13();
		  System.out.println("Printing Byte: "+result13);
		  
		  Short result14=method14();
		  System.out.println("Printing Short: "+result14);
		  
		  Integer result15=method15();
		  System.out.println("Printing Integer: "+result15);
		  
		  Long result16=method16();
		  System.out.println("Printing Long: "+result16);
		  
		  Float result17=method17();
		  System.out.println("Printing Float: "+result17);
		  
		  Double result18=method18();
		  System.out.println("Printing Double: "+result18);
		  
		  Character result19=method19();
		  System.out.println("Printing Character: "+result19);
		  
		  Boolean result20=method20();
		  System.out.println("Printing Boolean: "+result20);
	
	}

}
