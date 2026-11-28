package com.practice_arrays;

public class ArraysPractice16 {

	public static void main(String[] args) {
		String[][] arr=new String[2][2];
		
		arr[0][0]="apple";
		arr[0][1]="mango";
		
		arr[1][0]="grapes";
		arr[1][1]="orange";
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
