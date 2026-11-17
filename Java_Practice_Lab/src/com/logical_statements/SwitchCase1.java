package com.logical_statements;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a day:");
		String day=sc.next();
		
		switch(day) {
		case "mon" ->{
			System.out.println("Monday's are lazy days to work");
			System.out.println("switch cases are very simple");
		}
		case "tue","wed","thurs" -> System.out.println("Normal days to work");
		case "fri" -> System.out.println("weekend mode started !! just chill at office");
		case "sat","sun"->System.out.println("Holidays & Entertainmentn days");
		default->System.out.println("Entered day is not allowed");
		}

	}

}
