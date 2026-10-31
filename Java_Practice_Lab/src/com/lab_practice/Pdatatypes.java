package com.lab_practice;

//byte range = -128 to 127
//short range = -32768 to 32767
//int range =  -2,147,483,648 to 2,147,483,647
//long range = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//float =  6 to 7 decimal digits
//double =  15 to 16 decimal digits
public class Pdatatypes {
	
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean bo;
	

	//byte range = -128 to 127
	byte b1=127;
	byte b2=-128;
	byte b3=4;
	byte b4=(byte)128;
	byte b5=(byte)-130;
	//short range = -32768 to 32767
	short s1=-32768;
	short s2=32767;
	short s3=(short)32769;
	short s4=(short)-32772;
	short s5=125;
	//int range =  -2,147,483,648 to 2,147,483,647
	int i1=-4984498;
	int i2=398449844;
	int i3=(int)-4983499343995L;
	int i4='A';
	//long range = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	long l1=-9223372036854775808L;
	long l2=9223372036854775807L;
	long l3=788489;
	long l4='A';
	long l5='$';
	
	//float =  6 to 7 decimal digits
	float f1=4.25f;
	float f2=34.25046056f;
	float f3=6.790305034346566f;
	float f4=-12.346746f;
	float f5='A';
	//double =  15 to 16 decimal digits
	double d1=12.3355463434465754676435465577;
	double d2=-3.53546646598855779888389845;
	double d3=0;
	double d4=1;
	double d5='A';
	double d6=1.23456;
	
	char c1='A';
	char c2='a';
	char c3=99;
	char c4=73;
	char c5='7';
	char c6='\u20B9';
	
	
	boolean bo1=true;
	boolean bo2=false;
	
	
	byte by=100;
	short sh=20000;
	int in=100000;
	long lo=12345L;
	float flo=10.5f;
	double dou=19.345643d;
	char ch='A';
	boolean boo=true;

	public static void main(String[] args) {
		Pdatatypes pd1=new Pdatatypes();
		System.out.println("Byte value:"+pd1.b);
		System.out.println("Short value:"+pd1.s);
		System.out.println("Int value:"+pd1.i);
		System.out.println("Long value:"+pd1.l);
		System.out.println("Float value:"+pd1.f);
		System.out.println("Double value:"+pd1.d);
		System.out.println("Char value:"+pd1.c);
		System.out.println("Boolean value:"+pd1.bo);
		System.out.println( );
		System.out.println("Byte value:"+pd1.by);
		System.out.println("Short value:"+pd1.sh);
		System.out.println("Int value:"+pd1.in);
		System.out.println("Long value:"+pd1.lo);
		System.out.println("Float value:"+pd1.flo);
		System.out.println("Double value:"+pd1.dou);
		System.out.println("Char value:"+pd1.ch);
		System.out.println("Boolean value:"+pd1.boo);
		System.out.println( );
		System.out.println("####Byte Practice####");
		System.out.println( );
		System.out.println("Byte value:"+pd1.b1);
		System.out.println("Byte value:"+pd1.b2);
		System.out.println("Byte value:"+pd1.b3);
		System.out.println("Byte value:"+pd1.b4);
		System.out.println("Byte value:"+pd1.b5);
		System.out.println( );
		System.out.println("####Short Practice####");
		System.out.println( );
		System.out.println("Short value:"+pd1.s1);
		System.out.println("Short value:"+pd1.s2);
		System.out.println("Short value:"+pd1.s3);
		System.out.println("Short value:"+pd1.s4);
		System.out.println("Short value:"+pd1.s5);
		System.out.println( );
		System.out.println("####Int Practice####");
		System.out.println( );
		System.out.println("Int value:"+pd1.i1);
		System.out.println("Int value:"+pd1.i2);
		System.out.println("Int value:"+pd1.i3);
		System.out.println("Int value:"+pd1.i4);
		System.out.println( );
		System.out.println("####Long Practice####");
		System.out.println( );
		System.out.println("Long value:"+pd1.l1);
		System.out.println("Long value:"+pd1.l2);
		System.out.println("Long value:"+pd1.l3);
		System.out.println("Long value:"+pd1.l4);
		System.out.println("Long value:"+pd1.l5);
		System.out.println( );
		System.out.println("####Float Practice####");
		System.out.println( );
		System.out.println("Float value:"+pd1.f1);
		System.out.println("Float value:"+pd1.f2);
		System.out.println("Float value:"+pd1.f3);
		System.out.println("Float value:"+pd1.f4);
		System.out.println("Float value:"+pd1.f5);
		System.out.println( );
		System.out.println("####Double Practice####");
		System.out.println( );
		System.out.println("Double value:"+pd1.d1);
		System.out.println("Double value:"+pd1.d2);
		System.out.println("Double value:"+pd1.d3);
		System.out.println("Double value:"+pd1.d4);
		System.out.println("Double value:"+pd1.d5);
		System.out.println("Double value:"+pd1.d6);
		System.out.println( );
		System.out.println("####Char Practice####");
		System.out.println( );
		System.out.println("Char value:"+pd1.c1);
		System.out.println("Char value:"+pd1.c2);
		System.out.println("Char value:"+pd1.c3);
		System.out.println("Char value:"+pd1.c4);
		System.out.println("Char value:"+pd1.c5);
		System.out.println("Char value:"+pd1.c6);
		System.out.println( );
		System.out.println("####Boolean  Practice####");
		System.out.println( );
		System.out.println("Boolean value:"+pd1.bo1);
		System.out.println("Boolean value:"+pd1.bo2);
	}

}