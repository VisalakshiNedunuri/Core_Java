package com.practice_arrays;


//write a program to print string values in an array
public class ArraysPractice4 {

	public static void main(String[] args) {
		String[] arr= {"dgd","fdg","fdgfgf","dgfd","fdgfd"};
		String[] arr1=new String[5];//0 1 2 3 4 --> null null null null null
		
		arr1[0]="lakshya";
		arr1[1]="hardik";
		arr1[2]="dhoni";
		arr1[3]="rohi";
		arr1[4]="jadeja";
		arr1[4]="pandya";
		
	//	System.out.println(arr1[5]);
		
		for(String a:arr) {
			System.out.println(a);
		}
		System.out.println("**********************");
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("**************************");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("*************************");
		for(String a:arr1){
			System.out.println(a);
		}

	}

}
