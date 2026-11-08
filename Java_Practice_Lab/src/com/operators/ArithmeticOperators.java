package com.operators;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		byte sum=10+20;
		byte sub=20-15;
		byte mul=6*3;
		byte div=60/12;
		byte mod=5/2;
		
		short sum1=20+10;
		short sub1=30-20;
		short mul1=3*12;
		short div1=34/2;
		short mod1=16/8;
		
		int sum2=12+4;
		int sub2=13-3;
		int mul2=3*5;
		int div2=15/3;
		int mod2=32/2;
		
		long sum3=12134+43535;
		long sub3=57443-45466;
		long mul3=553465*45656;
		long div3=45664/2;
		long mod3=435644644%5452;
		
		float sum4=12.34f+22.33f;
		float sub4=455.64f-23.445f;
		float mul4=4454.5f*3435.5f;
		float div4=454.45f/45.2f;
		float mod4=54765.4f%435.4f;
		
		double sum5=324545.545645+5465456.4645454;
		double sub5=987687456.5656-543434.54654;
		double mul5=5656465.6455*54534.5454;
		double div5=9857655.565454/54354.545343;
		double mod5=4358475.565%45345.45446;
		
		char sum6='A'+3;
		char sub6='B'-'A';
		char mul6='A'*'B';
		char div6='B'/2;
		char mod6='C'/2;
		
/*		boolean sum7=true+true;
		boolean sub7=true-true;
		boolean mul7=true*false;
		boolean div7=true/true;
		boolean mod7=false%false;
	*/	
		String sum8="dhsj"+"dfhd";
	/*	String sub8="kjghf"-"mfbfd";
		String mul8="fdfn"*"fnbgb";
		String div8="jfghh"/"fgb";
		String mod8="fmgb"%"mbnvb";
		
		StringBuffer sum9=new StringBuffer("addf");
		StringBuffer sum91=new StringBuffer("fsdfd");
		StringBuffer sum911=new StringBuffer(sum9+sum91);
		StringBuffer sub9=new StringBuffer("addf");
		StringBuffer sub91=new StringBuffer("fsdfd");
		StringBuffer sub911=new StringBuffer(sub9-sub91);
		StringBuffer mul9=new StringBuffer("addf");
		StringBuffer mul91=new StringBuffer("fsdfd");
		StringBuffer mul911=new StringBuffer(mul9*mul91);
		StringBuffer div9=new StringBuffer("addf");
		StringBuffer div911=new StringBuffer("fsdfd");
		StringBuffer div911=new StringBuffer(div9/div91);
		StringBuffer mod9=new StringBuffer("addf");
		StringBuffer mod91=new StringBuffer("fsdfd");
		StringBuffer mod911=new StringBuffer(mod9%mod91);
		
		
		BigInteger sum10=new BigInteger("25465465498675");
		BigInteger sum101=new BigInteger("25465465498675");
		BigInteger sum1011=new BigInteger(sum10+sum101);
		BigInteger sub10=new BigInteger("25465465498675");
		BigInteger sub101=new BigInteger("25465465498675");
		BigInteger sub1011=new BigInteger(sub10-sub101);
		BigInteger mul10=new BigInteger("25465465498675");
		BigInteger mul101=new BigInteger("25465465498675");
		BigInteger mul1011=new BigInteger(mul10*mul101);
		BigInteger div10=new BigInteger("25465465498675");
		BigInteger div101=new BigInteger("25465465498675");
		BigInteger div1011=new BigInteger(div10+div101);
		BigInteger mod10=new BigInteger("25465465498675");
		BigInteger mod101=new BigInteger("25465465498675");
		BigInteger mod1011=new BigInteger(mod10+mod101);
		
		BigDecimal sum11=new BigDecimal("2546546.5498675");
		BigDecimal sum111=new BigDecimal("254654.65498675");
		BigDecimal sum1111=new BigDecimal(sum11+sum111);
		BigDecimal sub11=new BigDecimal("25465465498675");
		BigDecimal sub111=new BigDecimal("25465465498675");
		BigDecimal sub1111=new BigDecimal(sub11-sub111);
		BigDecimal mul11=new BigDecimal("25465465498675");
		BigDecimal mul111=new BigDecimal("25465465498675");
		BigDecimal mul1111=new BigDecimal(mul11*mul111);
		BigDecimal div11=new BigDecimal("25465465498675");
		BigDecimal div111=new BigDecimal("25465465498675");
		BigDecimal div1111=new BigDecimal(div11+div111);
		BigDecimal mod11=new BigDecimal("25465465498675");
		BigDecimal mod111=new BigDecimal("25465465498675");
		BigDecimal mod1111=new BigDecimal(mod11+mod111);
		
*/
		System.out.println("****************byte****************");
		System.out.println("Sum of two numbers:"+sum);
		System.out.println("Subtraaction  of two numbers:"+sub);
		System.out.println("Multiplication of two numbers:"+mul);
		System.out.println("Division of two numbers:"+div);
		System.out.println("Modulus of two numbers:"+mod);
		System.out.println("***************short*******************");
		System.out.println("Sum of two numbers:"+sum1);
		System.out.println("Subtraaction  of two numbers:"+sub1);
		System.out.println("Multiplication of two numbers:"+mul1);
		System.out.println("Division of two numbers:"+div1);
		System.out.println("Modulus of two numbers:"+mod1);
		System.out.println("***************int*******************");
		System.out.println("Sum of two numbers:"+sum2);
		System.out.println("Subtraaction  of two numbers:"+sub2);
		System.out.println("Multiplication of two numbers:"+mul2);
		System.out.println("Division of two numbers:"+div2);
		System.out.println("Modulus of two numbers:"+mod2);
		System.out.println("***************long*******************");
		System.out.println("Sum of two numbers:"+sum3);
		System.out.println("Subtraaction  of two numbers:"+sub3);
		System.out.println("Multiplication of two numbers:"+mul3);
		System.out.println("Division of two numbers:"+div3);
		System.out.println("Modulus of two numbers:"+mod3);
		System.out.println("***************float*******************");
		System.out.println("Sum of two numbers:"+sum4);
		System.out.println("Subtraaction  of two numbers:"+sub4);
		System.out.println("Multiplication of two numbers:"+mul4);
		System.out.println("Division of two numbers:"+div4);
		System.out.println("Modulus of two numbers:"+mod4);
		System.out.println("***************double*******************");
		System.out.println("Sum of two numbers:"+sum5);
		System.out.println("Subtraaction  of two numbers:"+sub5);
		System.out.println("Multiplication of two numbers:"+mul5);
		System.out.println("Division of two numbers:"+div5);
		System.out.println("Modulus of two numbers:"+mod5);
		System.out.println("***************char*******************");
		System.out.println("Sum of two numbers:"+sum6);
		System.out.println("Subtraaction  of two numbers:"+sub6);
		System.out.println("Multiplication of two numbers:"+mul6);
		System.out.println("Division of two numbers:"+div6);
		System.out.println("Modulus of two numbers:"+mod6);
		//System.out.println("***************boolean*******************");
		/*System.out.println("Sum of two numbers:"+sum7);
		System.out.println("Subtraaction  of two numbers:"+sub7);
		System.out.println("Multiplication of two numbers:"+mul7);
		System.out.println("Division of two numbers:"+div7);
		System.out.println("Modulus of two numbers:"+mod7);*/
		System.out.println("***************String*******************");
		System.out.println("Sum of two strings:"+sum8);
		/*System.out.println("Subtraaction  of two numbers:"+sub8);
		System.out.println("Multiplication of two numbers:"+mul8);
		System.out.println("Division of two numbers:"+div8);
		System.out.println("Modulus of two numbers:"+mod8);
		System.out.println("***************StringBuffer*******************");
		System.out.println("Sum of two numbers:"+sum911);
		System.out.println("Subtraaction  of two numbers:"+sub911);
		System.out.println("Multiplication of two numbers:"+mul911);
		System.out.println("Division of two numbers:"+div911);
		System.out.println("Modulus of two numbers:"+mod911);
		System.out.println("***************BigInteger*******************");
		System.out.println("Sum of two numbers:"+sum1011);
		System.out.println("Subtraaction  of two numbers:"+sub1011);
		System.out.println("Multiplication of two numbers:"+mul1011);
		System.out.println("Division of two numbers:"+div1011);
		System.out.println("Modulus of two numbers:"+mod1011);
		System.out.println("***************BigDecimal*******************");
		System.out.println("Sum of two numbers:"+sum1111);
		System.out.println("Subtraaction  of two numbers:"+sub1111);
		System.out.println("Multiplication of two numbers:"+mul1111);
		System.out.println("Division of two numbers:"+div1111);
		System.out.println("Modulus of two numbers:"+mod1111);
*/
	}

}
