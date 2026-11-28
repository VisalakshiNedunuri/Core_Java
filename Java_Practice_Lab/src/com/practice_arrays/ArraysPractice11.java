package com.practice_arrays;

import java.util.Arrays;

public class ArraysPractice11 {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {4,5,6};
		
		int[] c=new int[a.length+b.length];
		
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		System.out.println(Arrays.toString(c));
		for(int j=0;j<b.length;j++) {
			c[a.length+j]=b[j];
		}
		System.out.println(Arrays.toString(c));
	}

}
