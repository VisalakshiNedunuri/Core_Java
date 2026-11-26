package com.practice_arrays;

import java.util.Arrays;

//Declaring and initializing  and creating and printing an array.
public class ArraysPractice1 {

	public static void main(String[] args) {
		int[] arr3;
		int arr2[];
		
		int[] arr=new int[5];
		int[] arr1= {1,4,6,2,6,3,75,43,32,62,44};
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("**********************************");
		System.out.println("Lengths of arrays");
		System.out.println(arr.length);
		System.out.println(arr1.length);
		System.out.println("**********************************");
		System.out.println("Printing array elements using for loop");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
//			System.out.print(arr1[i]+" ");
		}
		System.out.println(Arrays.toString(arr1));
	}

}
