package com.practice_arrays;

import java.util.Scanner;

//Write a program to print the frequency count of a given number in an array?
public class ArraysPractice13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number in the array:");
		int num=sc.nextInt();
		
		int[] arr= {1,3,4,2,5,2,4,5,5,2,5,6,7,4,6,3,2};
		
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				count++;
			}
		}
		System.out.println("Frequency of the given number "+num +" is "+count);

	}

}
