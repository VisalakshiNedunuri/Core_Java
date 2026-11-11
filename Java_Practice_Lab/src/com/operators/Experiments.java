package com.operators;

public class Experiments {

	public static void main(String[] args) {
	/*	int a=2;
		int b=5;
		byte c=123;
		short d=4442;
		long e=232434433;
		char f='A';
		double g='A';
//		boolean h='A';// boolean has only true and false
		char i='A'+2;
		char j='a'-2;
		char k='A'*2;
		char l='A'/2;
		char m='A'%2;
		
		
		int sum1=a+b;
		int sum2=b+c;
		int sum3=a+d;
		//int sum4=a+e;
		
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(f);
		System.out.println((int)f);
		System.out.println((short)f);
		System.out.println((byte)f);
		System.out.println((long)f);
		System.out.println(g);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println("*********************************************");
		System.out.println(f);
		System.out.println((int)f);
		System.out.println(f+1);
		System.out.println((char)(f+1));
		System.out.println("*********************************************");
*/
		
		System.out.println("**********************************");
		int x=2;
		int y=3;
		int z=x++ - --y - x + y - x-- + y--;
		System.out.println("X="+x);
		System.out.println("Y="+y);
		System.out.println("Z="+z);
		
		System.out.println("**********************************");

		int x1=0;
		int y1=-1;
		int z1=(x1+y1)- --x1 + (x1+1) - y1-- + x1--;
		System.out.println("X1="+x1);
		System.out.println("Y1="+y1);
		System.out.println("Z1="+z1);
		
		System.out.println("**********************************");

		int x2=5;
		int y2=4;
		//int z2=(x2)^2 + (--y2)^2 - (x2++)^2 - y2++ + x2-- + y2--;
		int z22=(x2*x2) + ((--y2) * (--y2)) - ((x2++) * (x2++)) - (y2++) + (x2--) + (y2--);
		System.out.println("X2="+x2);
		System.out.println("Y2="+y2);
//		System.out.println("Z2="+z2);
		System.out.println("Z22="+z22);
		
		System.out.println("**********************************");

		
		int x3=-2;
		int y3=-5;
		int z3=(x3++ * 2) - (y3 - 2) + ((x3--)- 4) + (y3++ * 4);
		System.out.println("X3="+x3);
		System.out.println("Y3="+y3);
		System.out.println("Z3="+z3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}