package com.practice_arrays;

import java.util.Arrays;

//Write a program to print an array in a reverse order.
public class ArraysPractice7 {

	public static void main(String[] args) {
		int[] arr= {2,5,3,8,4,7,9};
		
		
		System.out.print("Reverse of a given array is ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		System.out.println("********Using two pointers***********");
//using two pointers
		int[] a= {1,2,3,4,5,6,7};
		int start=0;
		int end=a.length-1;
		int temp=0;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		System.out.println("Reverse of an array is "+Arrays.toString(arr));

	}

}
