package com.practice_arrays;

import java.util.Scanner;

//Write a program to print arrays value using scanner.
public class ArraysPractice9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter the elements:");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
