package com.lab_practice;

//import java.util.Scanner;

//Print all Magic Numbers from 1 to 1000.
public class MagicNumber4 {

	public static void main(String[] args) {
		
		int n=1000;
		
		System.out.println("The magic numbers are ");
		for(int i=1;i<=1000;i++) {
			if(isMagic(i)) {
				System.out.println(i+" ");
			}

		}
		

	}
	static boolean isMagic(int n){
		boolean status=false;
		int r=0;
		
		while(n>9) {
			int sum=0;
			while(n>0) {
				r=n%10;
				n=n/10;
				sum+=r;
			}
			n=sum;
		}
		if(n==1) {
			status=true;
		}
		return status;
		
	}

}
