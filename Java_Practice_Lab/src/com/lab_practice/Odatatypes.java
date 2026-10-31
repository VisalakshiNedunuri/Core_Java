package com.lab_practice;
import java.math.BigInteger;
import java.math.BigDecimal;

class Dog{
	String name;
	Dog(String name){
		this.name=name;
	}
	
}
public class Odatatypes {
	
	String st;
	StringBuffer stbu;
	BigInteger bii;
	BigDecimal bid;
	Integer ir;
	Character ch;
	Boolean bo;
	Dog dog;
	
	
	String s="vissu";
	String s1= new String("lakshi");
	StringBuffer sb= new StringBuffer("Suji");
	
	BigInteger bi=new BigInteger("1003848459835358305045643588535738326274673246");
	BigDecimal bd=new BigDecimal("23242443545234234356.54356687845753223365476587");
	
	Integer i=1293;
	Character c='a';
	Character c1=65;
	
	Boolean b=true;
	Dog d= new Dog("puppy");
	

	public static void main(String[] args) {
		Odatatypes obj=new Odatatypes();
		
		
		System.out.println("String default value:"+obj.st);
		System.out.println("StringBuffer default value:"+obj.stbu);
		System.out.println("BigInteger  default value:"+obj.bii);
		System.out.println("BigDecimal default value:"+obj.bid);
		System.out.println("Integer default value:"+obj.ir);
		System.out.println("character default value:"+obj.ch);
		System.out.println("Boolean default  value:"+obj.bo);
		System.out.println("Dog default value:"+obj.dog);
		
		System.out.println("*************************************");

		System.out.println("String value : "+obj.s);
		System.out.println("String value s1 : "+obj.s1);
		System.out.println("String Buffer value  : "+obj.sb);
		System.out.println("BigInteger value : "+obj.bi);
		System.out.println("BigDecimal Value : "+obj.bd);
		System.out.println("Integer value : "+obj.i);
		System.out.println("Character value : "+obj.c);
		System.out.println("Character value c1 : "+obj.c1);
		System.out.println("Boolean value : "+obj.b);
		System.out.println("Dog Value : "+obj.d.name);
		System.out.println("*****************************************");
		System.out.println("Addition of BigInteger values bi+bi="+obj.bi.add(obj.bi));
		System.out.println("Multiplication of BigInteger values bi*bi="+obj.bi.multiply(obj.bi));
		System.out.println("Substraction of BigInteger values bi-bi="+obj.bi.subtract(obj.bi));
		System.out.println("Division of BigInteger values bi/bi="+obj.bi.divide(obj.bi));
		System.out.println("Addition of BigDecimal values bd+bd="+obj.bd.add(obj.bd));
		System.out.println("Multiplication of BigDecimal values bd*bd="+obj.bd.multiply(obj.bd));
		System.out.println("Substraction of BigDecimal values bd-bd="+obj.bd.subtract(obj.bd));
		System.out.println("Division of BigDecimal values bd/bd="+obj.bd.divide(obj.bd));
		
	}

}


