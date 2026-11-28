package com.assignments;

import java.util.Scanner;

public class LoginAuthentication1 {

	public static void main(String[] args) {
		String password="vis123";
		
		int attempts = 0;
		do {
			attempts++;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Password:");
			String pw=sc.next();
			
			if(pw.equals(password)) {
				System.out.println("**********Login Successful**********");
				break;
			}else {
				System.out.println("Incorrect Password");
				if(attempts==3) {
					System.out.println("!!!!!!!!!!Your Account Locked!!!!!!!!!!!!");
				}
			}
		}while(attempts<3);
	}

}
