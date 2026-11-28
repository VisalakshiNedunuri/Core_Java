package com.practice_arrays;

//Jagged Arrays
public class ArraysPractice18 {

	public static void main(String[] args) {
		int[][] arr=new int[2][];
		
		arr[0]=new int[3];//00 01 02
		arr[1]=new int[2];//10 11
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=40;
		arr[1][1]=50;
		
		for(int[] a1:arr) {
			for(int a:a1) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
	}

}
