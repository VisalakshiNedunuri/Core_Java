package com.practice_arrays;

import java.util.Arrays;

public class ArraysPractice12 {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {4,5,6,7};
		
		int max_size=a.length;
		
		if(b.length>max_size) {
			max_size=b.length;
		}
		
		int[] c=new int[max_size];
		
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);
		
		for(int i=0;i<c.length;i++) {
			c[i]=a[i]+b[i];
		}
		System.out.println(Arrays.toString(c));
	}

}