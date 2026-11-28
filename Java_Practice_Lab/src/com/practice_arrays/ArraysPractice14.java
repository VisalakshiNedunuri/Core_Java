package com.practice_arrays;

//Write a program to print the maximum number and its frequency count in an array?
public class ArraysPractice14 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,1,3,4,5,6,1,3,1,6,8,6,4,3,3,2,1,1,5,4,1,7,7,7,7,7,7,7,7,7};
		
		int  maxElement=0;
		int maxCount=0;
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>maxCount) {
				maxCount=count;
				maxElement=arr[i];
			}
		}
		System.out.println("Max Element :"+maxElement);
		System.out.println("Max Element :"+maxCount);
	}

}
