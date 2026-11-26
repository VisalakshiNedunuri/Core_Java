package com.practice_arrays;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

import com.java_methods.Student;

public class ArraysPractice2 {

	public static void main(String[] args) {
		short[] a= {2,4,53,2,464,23,56,23,65,235,456,332,655};
		
		byte[] b= {3,63,23,57,86,3,67,3,64,88,34};
		
		int[] c= {2,45,2232,56,2342,56,3234,5652};
		
		long[] d= {243546544232l,453432233232l,53423,435454,32323545,'v'};
		
		double[] e= {23,54,32.33,545.343,232,53.5333,232.433};
		
		float[] f= {233465,43.4f,343.545f,332,'A',433,4356.4f};
		
		char[] g= {'a','f',66,34,'t','h'};
		
		boolean[] h= {true,false,false,false,true,true};
		
		Integer[] l= {};
		
		Byte[] by= {};
		
		Short[] sh= {};

		Long[] lo= {};
		
		Double[] dou= {};
		
		Float[] fl= {};
		
		Character[] ch= {};
		
		Boolean[] boo= {};
		
		
		String[] st= {"vissu","daddy","mumma","thambi"};
		
		BigInteger[] j= {new BigInteger("12234"),new BigInteger("6758964754"),new BigInteger("23232")};
		
		BigDecimal[] k= {new BigDecimal("12234.6454784"),new BigDecimal("675896475.765846744"),new BigDecimal("232327756594.7564485")};
		
		Student[] s= {};
		
		Object[] o= {3,'f',"fcrfd",45.34,true,453435,4454435};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
		System.out.println(Arrays.toString(g));
		System.out.println(Arrays.toString(h));
		System.out.println(Arrays.toString(st));
		System.out.println(Arrays.toString(j));
		System.out.println(Arrays.toString(k));
		System.out.println(Arrays.toString(o));
		
		
		System.out.println("*********************");
		for(int i=0;i<j.length;i++) {
			System.out.println(j[i]+" ");
		}
		
		System.out.println("*********************");
		
		for(int i=0;i<k.length;i++) {
			System.out.println(k[i]+" ");
		}
		
				
	}

}
