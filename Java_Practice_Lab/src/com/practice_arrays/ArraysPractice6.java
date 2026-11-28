package com.practice_arrays;

//write a program to print sum and average of student marks
public class ArraysPractice6 {

	public static void main(String[] args) {
		int[] marks= {100,100,90,80,100};
		
		int sum=0;
		int avg=0;
		
//		for(int a:marks) {
//			sum+=a;
//		}
		for(int i=0;i<marks.length;i++) {
			sum+=marks[i];
		}
		
		avg=sum/marks.length;
		
		System.out.println("Sum of marks:"+sum);
		System.out.println("Average of marks:"+avg);
	}

}

//what is the maximum size of an array in java?

//The theoretical maximum size of an array in Java is Integer.MAX_VALUE (2³¹ - 1, or 2,147,483,647 elements), 
//because Java arrays are indexed using 32-bit signed integers.