package com.practice_arrays;

//2-dimensional array
public class ArraysPractice15 {

	public static void main(String[] args) {
		int[][] arr=new int[5][3];
		int[][] arr1=new int[3][3];
		int[][] arr2=new int[2][];
		
		System.out.println(arr.length);//rows length=5
		System.out.println(arr[0].length);//column length=3
		System.out.println(arr[1].length);//column length=3
		System.out.println(arr[2].length);//column length=3
		System.out.println(arr[3].length);//column length=3
		System.out.println(arr[4].length);//column length=3
//		System.out.println(arr[5].length);//error->index out of bound
		
		arr1[0][0]=10;
		arr1[0][1]=20;
		arr1[0][2]=30;
		arr1[1][0]=40;
		arr1[1][1]=50;
		arr1[1][2]=60;
		arr1[2][0]=70;
		arr1[2][1]=80;
		arr1[2][2]=90;
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("***************");
		System.out.println(arr2[0]);
		
		arr2[0][1]=1;
		

	}

}
