package com.lab_practice;

public class Cricketer {
	
	static String boardname="BCCI";
	static String countryname="India";
	
	String cricketer_name;
	int jersey_no;
	int highest_score;

	public static void main(String[] args) {
		
		Cricketer c1 = new Cricketer();
		c1.cricketer_name="MS DHONI";
		c1.jersey_no=7;
		c1.highest_score=254;
		
		System.out.println(c1.cricketer_name);
		System.out.println(c1.jersey_no);
		System.out.println(c1.highest_score);
		
		System.out.println();
		
		Cricketer c2 = new Cricketer();
		c2.cricketer_name="Virat Kohli";
		c2.jersey_no=18;
		c2.highest_score=234;
		
		System.out.println(c2.cricketer_name);
		System.out.println(c2.jersey_no);
		System.out.println(c2.highest_score);
		
		System.out.println();
		
		Cricketer c3 = new Cricketer();
		c3.cricketer_name="Rohit Sharma";
		c3.jersey_no=45;
		c3.highest_score=214;
		
		System.out.println(c3.cricketer_name);
		System.out.println(c3.jersey_no);
		System.out.println(c3.highest_score);
		
		System.out.println();
		
		Cricketer c4 = new Cricketer();
		c4.cricketer_name="Hardik Pandya";
		c4.jersey_no=33;
		c4.highest_score=244;
		
		System.out.println(c4.cricketer_name);
		System.out.println(c4.jersey_no);
		System.out.println(c4.highest_score);
		
		

	}

}