package com.practice_arrays;

//Write a program to print array values
public class ArraysPractice3 {

	public static void main(String[] args) {
		int[] arr= {12,34,56,234,65,23,56,43};
		
		//using for  loop
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("****************************");
		//using for each loop
		for(int a:arr) {
			System.out.println(a);
		}
		System.out.println("*****************************");
		//Using while loop
		int i=0;
		while(i<arr.length) {
			System.out.println(arr[i]);
			i++;
		}
		System.out.println("*****************************");
		System.out.println(arr);//[I@2b2fa4f7
		System.out.println(arr[0]);//12
		System.out.println(arr.length);//8
		
		//printing even numbers in an array
		for(int a:arr) {
			if(a%2==0) {
				System.out.println(a);
			}
		}
	}

}
