package com.lab_practice;
import  java.math.BigInteger;
import java.math.BigDecimal;

public class Test3 {
	
	BigInteger bi1=new BigInteger("7334593833430857875035455443884583953663");
	BigInteger bi2=new BigInteger("6673429482964252596425245498568285282295");
	BigDecimal bd1=new BigDecimal("98765432109876543210.54321");
	BigDecimal bd2=new BigDecimal("1000000.00");

	public static void main(String[] args) {
		Test3 obj=new Test3();
		
		System.out.println("***************Operations on BigIntegers*********************");
		System.out.println("Addition of Two BigIntegers : "+obj.bi1.add(obj.bi2));
		System.out.println("Subtraction of Two BigIntegers : "+obj.bi1.subtract(obj.bi2));
		System.out.println("Multiplication of Two BigIntegers : "+obj.bi1.multiply(obj.bi2));
		System.out.println("Division of Two BigIntegers : "+obj.bi1.divide(obj.bi2));
		System.out.println("Modulus of Two BigIntegers : "+obj.bi1.mod(obj.bi2));
		System.out.println("******************Operations on BigDecimals******************");
		System.out.println("Addition of Two BigDecimals : "+obj.bd1.add(obj.bd2));
		System.out.println("Subtraction of Two BigDecimals : "+obj.bd1.subtract(obj.bd2));
		System.out.println("Multiplication of Two BigDecimals : "+obj.bd1.multiply(obj.bd2));
		System.out.println("Division of Two BigDecimals : "+obj.bd1.divide(obj.bd2));
		System.out.println("Modulus of Two BigDecimals : "+obj.bd1.remainder(obj.bd2));
	}

}
