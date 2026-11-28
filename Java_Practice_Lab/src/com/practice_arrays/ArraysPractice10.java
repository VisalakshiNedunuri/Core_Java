package com.practice_arrays;

import java.util.Scanner;

//Write  a program to check the given number is present in the array or not?
public class ArraysPractice10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		int[] arr= {1,5,2,7,53,75,34,33};
		
		boolean found=false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.println(num+" is present in the given array");
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println(num +"is not present in the given array");
		}
	}

}
