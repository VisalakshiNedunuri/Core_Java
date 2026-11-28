package com.practice_arrays;

//1. Store numbers in an array and print only the prime numbers.
public class PrimeNumber1 {

	public static void main(String[] args) {
		int[] arr= {12, 7, 4, 13, 9, 2, 17, 1, 19};
		
		int temp=0;
		System.out.print("Prime numbers are ");
		for(int i=0;i<arr.length;i++) {
			temp=arr[i];
			if(isPrime(temp)) {
				System.out.print(temp+" ");
			}
			
		}

	}
	static boolean isPrime(int temp) {
		boolean status=true;
		
		if(temp<=1) {
			status=false;
		}
		
		for(int i=2;i<temp;i++) {
			if(temp%i==0) {
				status=false;
			}
		}
		return status;
	}
}
