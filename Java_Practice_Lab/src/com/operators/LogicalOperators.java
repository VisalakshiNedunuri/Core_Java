package com.operators;

//Logical Operators
// && !! !
//Logical operators working between the conditions or expressions and resulted values are boolean 
public class LogicalOperators {

	public static void main(String[] args) {
		
		
		int x=10;
		int y=15;
		int z=20;
		
		
		
		System.out.println("************&&***************");
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(false && true);//false and 2nd condition is dead code
		System.out.println(false && false);//false
		
		
		System.out.println(x<y && y<z);//true
		System.out.println(x<y && y>z);//false
		System.out.println(x>y && y<z);//false
		System.out.println(x>y && y>z);//false
		
		
		int a=10;
		System.out.println(++a < 15 && ++a<15);
	    System.out.println(a);//12
	    
	    System.out.println(++a >15 && ++a<15);
	    System.out.println(a);//13 and 2nd part of the code is dead code when first condition is false
	    
	    System.out.println("**********Logical OR (||)************");
	    
	    System.out.println(true || true);//true
		System.out.println(true || false);//true
		System.out.println(false || true);//true
		System.out.println(false || false);//false
		
		
		System.out.println(x<y || y<z);//true
		System.out.println(x<y || y>z);//true
		System.out.println(x>y || y<z);//true
		System.out.println(x>y || y>z);//false
		
		System.out.println(++a < 15 || ++a<15);
	    System.out.println(a);//11
	    
	    System.out.println(++a >15 || ++a<15);
	    System.out.println(a);//13 and 2nd part of the code is dead code when first condition is false
	    
	    System.out.println("***********Logical NOT (!)************");
	    
	    System.out.println(!true);//false
	    System.out.println(!false);//true
	    
	    System.out.println(!(x<y));//false
	    
	    
//	    System.out.println(0 && 1);-->compliation error

	}

}
