package com.practice_arrays;

//Write a program to print sum of its array numbers.
public class ArraysPractice5 {

	public static void main(String[] args) {
		int[] arr= {1,2,4,5,2,4,2};
		int sum=0;
		int sum1=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of numbers in an array using for loop:"+sum);
		
		for(int a:arr) {
			sum1+=a;
		}
		System.out.println("Sum of numbers in an array using for each loop:"+sum1);
	}

}
