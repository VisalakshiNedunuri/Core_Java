package com.logical_statements;

import java.util.Scanner;

//write a program to print calculated values as a result based on two values...?
public class SwitchCaseInLoop {

	public static void main(String[] args) {
		String yn="";
		
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number:");
			int a=sc.nextInt();
			
			System.out.println("Enter b number:");
			int b=sc.nextInt();
			
			int result=0;
			
			System.out.println("Enter a symbol to proceed: like + - * / % ");
			String symb=sc.next();
			
			
			switch(symb) {
			case "+" -> result=a+b;
			case "-" -> result=a-b;
			case "*" -> result=a*b;
			case "/" -> result=a/b;
			case "%" -> result=a%b;
			default  -> System.out.println("Enter a symbol not valid!!");
			}
			
			System.out.println("The resulted value is :"+result);
			System.out.println("Do you want to continue.....?Click Y for yes and N for no");
			yn=sc.next();
		}while(yn.equalsIgnoreCase("y"));

	}

}
