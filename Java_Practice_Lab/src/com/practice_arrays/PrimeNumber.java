package com.practice_arrays;
import java.util.Scanner;

//Write a Java program that reads the array size and its elements from the user, then prints only the prime numbers.
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter array size:");
		int  size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter the  values:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}	
		
		int temp = 0;
		
		System.out.print("The prime numbers in the given array are ");
		for(int a:arr) {
			temp=a;
			if(isPrime(temp)) {
				System.out.print(temp+" ");
			}
		}
		
	}
	static boolean isPrime(int temp) {
		boolean status=true;
		
		if(temp<=1) {
			return false;
		}
		
		for(int i=2;i<temp;i++) {
			if(temp%i==0) {
				status=false;
				break;
			}
		}
		
		return status;
	}

}