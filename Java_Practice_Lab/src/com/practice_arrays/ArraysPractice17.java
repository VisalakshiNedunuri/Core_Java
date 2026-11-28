package com.practice_arrays;

public class ArraysPractice17 {

	public static void main(String[] args) {
		int[][] arr={{0,1,2,3},{4,5,6,7},{8,9,10,11},{12,13,14,15}};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		for(int[] a1:arr) {
			for(int a:a1) {
				System.out.print(a+" ");
			}
			System.out.println();
		}

	}

}
