package com.lab_practice;

import java.util.Scanner;

public class MagicNumber2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		
		if(isMagic(n)) {
			System.out.println("It is a magic number");
		}else {
			System.out.println("It is not  a magic number");
		}
		

	}
	static boolean isMagic(int n) {
		return n>0 && (n-1)%9==0;
	}

}
