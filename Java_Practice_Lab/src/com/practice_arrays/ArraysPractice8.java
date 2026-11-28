package com.practice_arrays;

//Write a program to print min and max of an array?
public class ArraysPractice8 {

	public static void main(String[] args) {
		int[] arr= {1,9,3,6,5,4,7};
		
		int[] arr1= {9,22,3,53,56,32,4};
		
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Maximum element in an array:"+max);
		System.out.println("Minimum element in an array:"+min);
		
		int min1=arr1[0];
		int max1=arr1[0];
		
		System.out.println("*********Using for each loop***********");
		
		for(int a:arr1) {
			if(a<min1) {
				min1=a;
			}
			if(a>max1) {
				max1=a;
			}
		}
		System.out.println("Maximum element in an array:"+max1);
		System.out.println("Minimum element in an array:"+min1);
	}

}
